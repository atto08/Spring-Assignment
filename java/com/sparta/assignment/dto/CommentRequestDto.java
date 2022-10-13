package com.sparta.assign3.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CommentRequestDto {
    private Long boardId;
    private String content;
}
