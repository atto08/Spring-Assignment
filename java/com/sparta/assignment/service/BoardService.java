package com.sparta.assignment.service;

import com.sparta.assignment.dto.BoardResponseDto;
import com.sparta.assignment.dto.PasswordRequestDto;
import com.sparta.assignment.entity.Board;
import com.sparta.assignment.dto.BoardRequestDto;
import com.sparta.assignment.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@RequiredArgsConstructor // final로 선언된 멤버 변수를 자동으로 생성합니다.
@Service // 서비스임을 선언합니다.
public class BoardService {
    private final BoardRepository boardRepository;

    // id에 해당하는 게시글 수정하는 함수
    @Transactional // 메소드 동작이 SQL 쿼리문임을 선언합니다.
    public Boolean update(Long id, BoardRequestDto requestDto) {
        Board board = boardRepository.findById(id).orElseThrow(() -> new NullPointerException("해당 아이디가 존재하지 않습니다."));
        board.update(requestDto);
        return true;
    }

    // id를 찾고 그 id에 있는 정보를 ResponseDto 에 담아 필요한 정보만 ResponseDto 타입으로 리턴 해주는 함수
    @Transactional // 메소드 동작이 SQL 쿼리문임을 선언합니다.
    public BoardResponseDto findBoardId(Long id) {
        Board board = boardRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 글입니다."));
        return new BoardResponseDto(board);
    }

    // 입력받은 비밀번호가 id에 해당하는 게시글의 비밀번호와 일치하는지 확인하는 함수
    @Transactional // 메소드 동작이 SQL 쿼리문임을 선언합니다.
    public Boolean checkPassword(Long id, PasswordRequestDto passwordRequestDto) {
        Board board = boardRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 글입니다."));
        if (board.getPassword().equals(passwordRequestDto.getPassword())) {
            return true;
        } else{
            return false;
        }
    }


//    @Transactional
//    public Boolean deleteBoard(Long id, PasswordRequestDto passwordRequestDto) {
//        Board board = boardRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 글입니다."));
//
//        if (board.getPassword().equals(passwordRequestDto.getPassword())){
//            boardRepository.deleteById(id);
//            return true;
//        } else{
//            return false;
//        }
//    }

}
