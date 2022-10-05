package com.sparta.assignment.controller;

import com.sparta.assignment.dto.BoardResponseDto;
import com.sparta.assignment.dto.PasswordRequestDto;
import com.sparta.assignment.entity.Board;
import com.sparta.assignment.dto.BoardRequestDto;
import com.sparta.assignment.repository.BoardRepository;
import com.sparta.assignment.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor // final로 선언된 멤버 변수를 자동으로 생성합니다.
@RestController // JSON으로 데이터를 주고받음을 선언합니다.
public class BoardRestController {

    private final BoardService boardService;
    private final BoardRepository boardRepository;

    // 게시된 글 전체목록 조회
    @GetMapping("/api/boards")
    public List<Board> getBoards() {
        return boardRepository.findAll();
    }

    // 신규 게시글 등록
    @PostMapping("/api/boards")
    public Board createBoard(@RequestBody BoardRequestDto requestDto) {
        Board board = new Board(requestDto);
        boardRepository.save(board);
        return board;
    }

    // 게시글 조회
    @GetMapping("/api/boards/{id}")
    public BoardResponseDto getBoard(@PathVariable Long id) {
        return boardService.findBoardId(id);
    }

    // 게시글 패스워드 확인
    @PostMapping("/api/boards/{id}")
    public Boolean passwordCheck(@PathVariable Long id, @RequestBody PasswordRequestDto passwordRequestDto){
        return boardService.checkPassword(id, passwordRequestDto);
    }

    //게시글 수정
    @PutMapping("/api/boards/{id}")
    public Boolean updateBoard(@PathVariable Long id, @RequestBody BoardRequestDto requestDto) {
        return boardService.update(id, requestDto);
    }


    //게시글 삭제
    @DeleteMapping("/api/boards/{id}")
    public Long deleteBoard(@PathVariable Long id) {
        boardRepository.deleteById(id);
        return id;
    }
}
