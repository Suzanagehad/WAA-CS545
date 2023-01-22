package edu.miu.WAALab3.service;

import edu.miu.WAALab3.domain.Comment;
import edu.miu.WAALab3.domain.Post;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    public List<Post> findAll();
    public Post getById(long id);
    public void save(Post post);
    public void delete(long id);
    public void update(long id, Post post);
    public List<Comment> findComments(long id);
    public void addComments(long id, Comment comment);
    public List<Post> findPostByTitle(@Param("title") String title);

}
