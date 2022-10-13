package com.sparta.assign3.controller;

import com.sparta.assign3.dto.CommentRequestDto;
import com.sparta.assign3.entity.Board;
import com.sparta.assign3.entity.Comment;
import com.sparta.assign3.repository.BoardRepository;
import com.sparta.assign3.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class CommentController {
    private final CommentRepository commentRepository;
    private final BoardRepository boardRepository;

    @GetMapping("/api/comment")
    public List<Comment> getComment(@RequestParam Long boardId){
        Optional<Board> optionalBoard = boardRepository.findById(boardId);
        return optionalBoard.map(board -> commentRepository.findByBoard(board, Sort.by(Sort.Direction.DESC,"createAt")
        )).orElse(null);
    }

    @PostMapping("/api/comment")
    public Comment createComment(@RequestParam Long boardId, @RequestBody CommentRequestDto requestDto) {
        Comment comment = new Comment(requestDto);
        Optional<Board> optionalBoard  = boardRepository.findById(boardId);
        optionalBoard.ifPresent(board -> board.addComment(comment));
        return commentRepository.save(comment);
    }
}
