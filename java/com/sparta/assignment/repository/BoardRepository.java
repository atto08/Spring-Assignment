package com.sparta.assignment.repository;

import com.sparta.assignment.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
