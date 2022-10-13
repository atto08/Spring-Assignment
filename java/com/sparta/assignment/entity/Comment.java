package com.sparta.assign3.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sparta.assign3.dto.CommentRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Comment extends Timestamped{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(nullable = false)
    private String content;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "BOARD_ID", nullable = false)
    private Board board;

    public Comment(CommentRequestDto requestDto){
        this.content = requestDto.getContent();
    }

    public Comment(CommentRequestDto requestDto, Board board ){
        this.content = requestDto.getContent();
        board.addComment(this);
    }

    public void updateComment( CommentRequestDto requestDto) {
        this.content = requestDto.getContent();
    }
}
