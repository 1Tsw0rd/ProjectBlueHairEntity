package com.bluehair.bluehairtemp.repository;

import com.bluehair.bluehairtemp.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
