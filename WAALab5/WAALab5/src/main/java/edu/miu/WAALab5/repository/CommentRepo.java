package edu.miu.WAALab5.repository;

import edu.miu.WAALab5.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Long>{
}
