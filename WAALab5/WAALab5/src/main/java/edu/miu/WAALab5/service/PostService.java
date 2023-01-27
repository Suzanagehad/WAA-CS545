package edu.miu.WAALab5.service;

import edu.miu.WAALab5.domain.Comment;
import edu.miu.WAALab5.domain.Post;

import java.util.List;

public interface PostService {
    List<Comment> getPostWithComments(long id);

    public List<Post> getAllByTitle(String title);
}
