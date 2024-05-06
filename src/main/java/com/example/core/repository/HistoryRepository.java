package com.example.core.repository;

import com.example.core.entity.History;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository("historyRepository")
public interface HistoryRepository extends MongoRepository<History, String> {


}
