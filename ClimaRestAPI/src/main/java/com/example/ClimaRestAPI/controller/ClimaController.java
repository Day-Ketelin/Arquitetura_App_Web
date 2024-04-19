package com.example.ClimaRestAPI.controller;

import com.example.ClimaRestAPI.model.ClimaEntity;
import com.example.ClimaRestAPI.service.ClimaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clima")
public class ClimaController {
    @Autowired
            private ClimaService climaService;

    @GetMapping
            public List<ClimaEntity> obterTodos() {return climaService.obterTodos(); }

    @GetMapping("/{id}")
     public ClimaEntity obterPorId(@PathVariable String id) {return climaService.obterPorId(id); }

    @PostMapping
            public ClimaEntity inserir(@RequestBody ClimaEntity clima) {return climaService.inserir(clima) ;}

     @PutMapping("/{id}")
     public ClimaEntity atualizar(@PathVariable String id, @RequestBody ClimaEntity clima) {
        return climaService.atualizar(id, clima);
     }

     @DeleteMapping("/{id}")
             public void excluir(@PathVariable String id) {climaService.excluir(id); }


    //Classe de serviços
    ClimaService service = new ClimaService();

   @GetMapping("/clima")
    public String preverTempo() {
        return service.preverTempo();
    }
}