package com.example.ClimaRestAPI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clima")
public class ClimaEntity {
    @Id
    private String id;
    private String cidade;
    private String temperatura;

    public String getId() {return id;}

    public void setId(String id) {
        this.id = id;
    }
    public String getCidade() {return cidade;}

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTemperatura() {return temperatura;}

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }


}
