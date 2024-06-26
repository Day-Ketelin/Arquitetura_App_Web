package com.example.FipeRestAPI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fipe")
public class FipeEntity {
    @Id
    private String id;
    private String marca;
    private String modelo;
    private String ano;
    private String valor;

    public String getId() {return id;}
    public void setId(String id) {
        this.id = id;
    }
    public String getMarca() {return marca;}

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {return modelo;}

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {return ano;}

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getValor() {return valor;}

    public void setValor(String valor) {
        this.valor = valor;
    }
}
