package com.example.core.repository;

import com.example.core.entity.Session;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("sessionRepository")
public interface SessionRepository extends MongoRepository<Session, String> {
    

}
