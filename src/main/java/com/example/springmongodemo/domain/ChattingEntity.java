package com.example.springmongodemo.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "chatting_data") // 실제 몽고 DB 컬렉션 이름
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ChattingEntity {
    @Id
    private Long id;
    private String name;

    @Field(name = "room_no")
    private int roomNO;

}
