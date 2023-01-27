package edu.miu.WAALab5.service.impl;

import edu.miu.WAALab5.domain.Comment;
import edu.miu.WAALab5.domain.Post;
import edu.miu.WAALab5.repository.PostRepo;
import edu.miu.WAALab5.service.PostService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepo postRepo;
    @Override
    public List<Comment> getPostWithComments(long id) {
        return postRepo.findById(id).get().getComments() ;
    }

    @Override
    public List<Post> getAllByTitle(String title) {
        var posts = postRepo.findAll();
        return posts.stream().filter(p->p.getTitle().equals(title)).collect(Collectors.toList());
    }
}
