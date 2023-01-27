package edu.miu.WAALab5.service.impl;

import edu.miu.WAALab5.domain.Comment;
import edu.miu.WAALab5.repository.CommentRepo;
import edu.miu.WAALab5.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepo commentRepo;

    @Override
    public void addComment(Comment comment) {
        commentRepo.save(comment);
    }

    @Override
    public List<Comment> getAll() {
        return commentRepo.findAll();
    }
}
