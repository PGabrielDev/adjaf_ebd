package io.github.pgabrieldev.adjafebd.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import io.github.pgabrieldev.adjafebd.entities.AlunoPresenca;

@Repository
public interface AlunoPresencaRepository extends ReactiveMongoRepository<AlunoPresenca, String> {
    
}
