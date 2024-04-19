package com.example.FipeRestAPI.controller;

import com.example.FipeRestAPI.model.FipeEntity;
import com.example.FipeRestAPI.service.FipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fipe")
public class FipeController {

    @Autowired
    private FipeService fipeService;

    @GetMapping
    public List<FipeEntity> obterTodos() {return fipeService.obterTodos(); }

    @GetMapping("/{id}")
    public FipeEntity obterPorId(@PathVariable String id) {return fipeService.obterPorId(id); }

    @PostMapping
    public FipeEntity inserir(@RequestBody FipeEntity fipe) {return fipeService.inserir(fipe) ;}

    @PutMapping("/{id}")
    public FipeEntity atualizar(@PathVariable String id, @RequestBody FipeEntity fipe) {
        return fipeService.atualizar(id, fipe);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable String id) {fipeService.excluir(id); }

 FipeService service = new FipeService();

  @GetMapping("/marcas")
public String consultarMarcas(){
 return service.consultarMarcas();
  }
 @GetMapping("/modelos/{marca}")
 public String consultarModelos(@PathVariable String marca){
     return service.consultarModelos(marca);
 }
 @GetMapping("/anos/{marca}/{modelo}")
  public String consultarAnos(@PathVariable String marca, @PathVariable String modelo){
     return service.consultarAnos(marca, modelo);
 }
@GetMapping("/valor/{marca}/{modelo}/{ano}")
      public String consultarValor(@PathVariable String marca, @PathVariable String modelo, @PathVariable String ano){

    return service.consultarValor(marca, modelo, ano);
}

    }
