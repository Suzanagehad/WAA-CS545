package edu.miu.WAALab3.service.implmantations;

import edu.miu.WAALab3.domain.Comment;
import edu.miu.WAALab3.domain.Post;
import edu.miu.WAALab3.repository.PostRepo;
import edu.miu.WAALab3.service.CommentService;
import edu.miu.WAALab3.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepo postRepo;
    @Override
    public List<Post> findAll() {
        return postRepo.findAll();
    }

    @Override
    public Post getById(long id) {
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
        p.setAuthor(post.getAuthor());
        p.setTitle(post.getTitle());
        p.setContent(post.getContent());
        postRepo.save(post);
    }

    @Override
    public List<Comment> findComments(long id) {
        Post p= postRepo.findById(id).orElse(null);
        return p.getCommentList();
    }

    @Override
    public void addComments(long id, Comment comment) {
       postRepo.findById(id).get().getCommentList().add(comment);
       postRepo.save(postRepo.findById(id).get());

    }

    @Override
    public List<Post> findPostByTitle(String title) {
        return postRepo.findPostByTitle(title);
    }
}
