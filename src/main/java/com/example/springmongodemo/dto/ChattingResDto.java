package com.example.springmongodemo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChattingResDto {
    private String name;
    private int roomNO;

    public ChattingResDto(String name, int roomNO) {
        this.name = name;
        this.roomNO = roomNO;
    }
}
