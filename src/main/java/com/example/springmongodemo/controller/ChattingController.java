package com.example.springmongodemo.controller;

import com.example.springmongodemo.dto.ResponseDto;
import com.example.springmongodemo.service.ChattingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChattingController {

    private final ChattingService chattingService;

    /**
     * READ Test 입니다.
     */
    @GetMapping("/test")
    public ResponseEntity<?> test(String name) {
        return ResponseEntity.status(HttpStatus.OK).body(ResponseDto.success(HttpStatus.OK,chattingService.read(name)));
    }
}
