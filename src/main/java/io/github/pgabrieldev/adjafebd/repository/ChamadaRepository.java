package io.github.pgabrieldev.adjafebd.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import io.github.pgabrieldev.adjafebd.entities.Chamada;

@Repository
public interface ChamadaRepository extends ReactiveMongoRepository<Chamada, String> {
    
}
