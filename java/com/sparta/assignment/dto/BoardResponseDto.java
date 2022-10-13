package com.sparta.assign3.dto;

import com.sparta.assign3.entity.Board;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Getter
public class BoardResponseDto {
    private LocalDateTime createdAt;
    private String title;
    private String content;
    private String author;

    //생성자
    // 게시글 조회시 담아올 Dto
    public BoardResponseDto(Board board){
        this.createdAt = board.getCreatedAt();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.author = board.getAuthor();
    }
}
