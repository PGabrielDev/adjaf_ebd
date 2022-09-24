package io.github.pgabrieldev.adjafebd.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoPresencaRepository extends ReactiveMongoRepository<AlunoPresencaRepository, String> {
    
}
