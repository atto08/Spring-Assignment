package com.sparta.assign3.repository;

import com.sparta.assign3.entity.Board;
import com.sparta.assign3.entity.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByBoard(Board board, Sort sort);
}
