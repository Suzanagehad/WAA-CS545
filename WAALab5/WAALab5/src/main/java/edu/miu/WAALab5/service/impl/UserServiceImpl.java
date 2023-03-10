package edu.miu.WAALab5.service.impl;

import edu.miu.WAALab5.domain.Post;
import edu.miu.WAALab5.domain.User;
import edu.miu.WAALab5.repository.UserRepo;
import edu.miu.WAALab5.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getById(long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public void saveUser(User user) {
        userRepo.save(user);
    }

    @Override
    public List<Post> getUsersPosts(long id) {
        return userRepo.findById(id).get().getPosts();
    }

    @Override
    public List<User> getUserByPosts(int num) {
        var users = userRepo.findAll();
        return  users.stream().filter(u->u.getPosts().
                size()>num).collect(Collectors.toList());
    }
}
