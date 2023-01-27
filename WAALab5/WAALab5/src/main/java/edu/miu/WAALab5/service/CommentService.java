package edu.miu.WAALab5.service;

import edu.miu.WAALab5.domain.Comment;

import java.util.List;

public interface CommentService {
    void addComment(Comment comment);
    List<Comment> getAll();
}
