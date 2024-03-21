package com.example.springmongodemo.service;

import com.example.springmongodemo.domain.ChattingRepository;
import com.example.springmongodemo.dto.ChattingResDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChattingService {

    private final ChattingRepository chattingRepository;

    /**
     * Read Test
     */
    public ChattingResDto read(String name) {
        return chattingRepository.findByName(name);
    }
}
