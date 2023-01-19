package edu.miu.WAALab1.Service.impl;
import edu.miu.WAALab1.Domain.Post;
import edu.miu.WAALab1.Domain.dto.PostDto;

import edu.miu.WAALab1.Repo.PostRepo;
import edu.miu.WAALab1.Service.PostService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
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
        return postRepo.findAll();
    }

    @Override
    public PostDto findById(long id) {
        Post post= postRepo.findById(id);
        return new PostDto(post.getTitle(),post.getContent(),post.getAuthor());
    }

    @Override
    public void save(Post post) {
        postRepo.save(post);
    }

    @Override
    public void delete(long id) {
        postRepo.delete(id);

    }

    @Override
    public void update(long id, Post post) {
        postRepo.update(id, post);
    }

    @Override
    public List<Post> findPostByAuthor(String author) {
        return postRepo.findPostByAuthor(author);
    }
}
