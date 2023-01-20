package edu.miu.WAALab2.Service;


import edu.miu.WAALab2.Domain.Post;
import edu.miu.WAALab2.Domain.dto.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PostService {
    public List<Post> findAll();
   public Post findById(long id);
    void save(Post post);
    void delete(long id);
    void update(long id, Post post);

}
