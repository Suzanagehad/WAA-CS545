package edu.miu.WAALab3.service;

import edu.miu.WAALab3.domain.Comment;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    public Iterable<Comment>findALl();
    public Comment findById(long id);
    public void save(Comment comment);
    public void delete(long id);
    public void update(long id, Comment comment);
}
