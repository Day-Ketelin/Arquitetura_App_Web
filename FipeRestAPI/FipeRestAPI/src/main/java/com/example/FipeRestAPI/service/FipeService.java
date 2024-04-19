package com.example.FipeRestAPI.service;

import com.example.FipeRestAPI.model.FipeEntity;
import com.example.FipeRestAPI.repository.FipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Service
public class FipeService {

    @Autowired
    private FipeRepository fipeRepository;

    public List<FipeEntity> obterTodos() {return fipeRepository.findAll(); }

    public FipeEntity obterPorId(String id) {return fipeRepository.findById(id).orElse(null);}

    public FipeEntity inserir(FipeEntity fipe) {return fipeRepository.save(fipe);}

    public FipeEntity atualizar(String id, FipeEntity newFipe) {
        FipeEntity existingFipe = fipeRepository.findById(id).orElse(null);

        if (existingFipe != null) {
            existingFipe.setMarca(newFipe.getMarca());
            existingFipe.setModelo(newFipe.getModelo());
            existingFipe.setAno(newFipe.getAno());
            existingFipe.setValor(newFipe.getValor());
            return fipeRepository.save((existingFipe));
        } else { //se o carro não existir na fipe
            return null;
        }
    }

        public void excluir(String id) {fipeRepository.deleteById(id);}

 private String consultarURL(String apiUrl){
        String dados = "";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            dados = responseEntity.getBody();
        } else {
            dados = "Falha ao obter dados. Código de status: " + responseEntity.getStatusCode();
        }
        return dados;
    }
    public String consultarMarcas() {
        return consultarURL("https://parallelum.com.br/fipe/api/v1/carros/marcas");
    }
    public String consultarModelos(String id) {
        return consultarURL("https://parallelum.com.br/fipe/api/v1/carros/marcas/"+id+"/modelos");
    }
    public String consultarAnos(String marca, String modelo) {
        return consultarURL("https://parallelum.com.br/fipe/api/v1/carros/marcas/"+marca+"/modelos/"+modelo+"/anos");
    }
    public String consultarValor(String marca, String modelo, String ano) {
        return consultarURL("https://parallelum.com.br/fipe/api/v1/carros/marcas/"+marca+"/modelos/"+modelo+"/anos/"+ano);
    }
}
