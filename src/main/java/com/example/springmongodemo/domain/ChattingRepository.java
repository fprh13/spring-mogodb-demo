package com.example.springmongodemo.domain;

import com.example.springmongodemo.dto.ChattingResDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChattingRepository extends MongoRepository<ChattingEntity, Long> {
    ChattingResDto findByName(String name);
}
