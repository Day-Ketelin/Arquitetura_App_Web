package com.example.FipeRestAPI.repository;

import com.example.FipeRestAPI.model.FipeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FipeRepository extends MongoRepository<FipeEntity, String> {
    //Disponibilização dos métodos CRUD
}
