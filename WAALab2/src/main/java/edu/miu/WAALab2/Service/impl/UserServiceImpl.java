package edu.miu.WAALab2.Service.impl;

import edu.miu.WAALab2.Domain.Post;
import edu.miu.WAALab2.Domain.User;
import edu.miu.WAALab2.Repo.UserRepo;
import edu.miu.WAALab2.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
   @Autowired
    UserRepo userRepo;
    @Override
    public List<User> findAll() {
        return (List<User>)userRepo.findAll();
    }

    @Override
    public User getById(long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public List<Post> findPosts(long id) {
       User user= userRepo.findById(id).orElse(null);
       return user.getPosts();
    }
}
