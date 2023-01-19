package edu.miu.WAALab1.Service;


import edu.miu.WAALab1.Domain.Post;
import edu.miu.WAALab1.Domain.dto.PostDto;

import java.util.List;

public interface PostService {
    public List<Post> findAll();
   public PostDto findById(long id);
    void save(Post post);
    void delete(long id);
    void update(long id, Post post);
   public List<Post> findPostByAuthor(String author);
}
