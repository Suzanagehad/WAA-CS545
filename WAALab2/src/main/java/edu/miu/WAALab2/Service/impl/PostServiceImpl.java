package edu.miu.WAALab2.Service.impl;

import edu.miu.WAALab2.Domain.Post;
import edu.miu.WAALab2.Domain.dto.PostDto;
import edu.miu.WAALab2.Repo.PostRepo;
import edu.miu.WAALab2.Service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
   @Autowired
   PostRepo postRepo;

    @Override
    public List<Post> findAll() {
        return (List<Post>) postRepo.findAll();
    }

    @Override
    public Post findById(long id) {
      return postRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Post post) {
        postRepo.save(post);
    }

    @Override
    public void delete(long id) {
        postRepo.deleteById(id);

    }

    @Override
    public void update(long id, Post post) {
        Post p= postRepo.findById(id).orElse(null);
        p.setTitle(post.getTitle());
        p.setAuthor(post.getAuthor());
        p.setContent(post.getContent());
    }


}
