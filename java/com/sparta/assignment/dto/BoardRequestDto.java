package com.sparta.assign3.dto;

import lombok.Getter;

@Getter
public class BoardRequestDto {
    private String title;
    private String content;
    private String author;
    private String password;
}
