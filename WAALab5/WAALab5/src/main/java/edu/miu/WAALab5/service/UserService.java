package edu.miu.WAALab5.service;

import edu.miu.WAALab5.domain.Post;
import edu.miu.WAALab5.domain.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getById(long id);
    void saveUser(User user);
    List<Post> getUsersPosts(long id);
    public List<User> getUserByPosts(int num);
}
