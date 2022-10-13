package com.sparta.assign3.repository;

import com.sparta.assign3.entity.Board;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    @Override
    List<Board> findAll(Sort sort);
}
