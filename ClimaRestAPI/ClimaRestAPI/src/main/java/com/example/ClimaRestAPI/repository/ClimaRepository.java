package com.example.ClimaRestAPI.repository;

import com.example.ClimaRestAPI.model.ClimaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClimaRepository extends MongoRepository<ClimaEntity, String> {
 //Disponibilização dos métodos CRUD

}
