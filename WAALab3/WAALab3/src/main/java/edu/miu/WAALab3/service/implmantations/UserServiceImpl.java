package edu.miu.WAALab3.service.implmantations;

import edu.miu.WAALab3.domain.Post;
import edu.miu.WAALab3.domain.User;
import edu.miu.WAALab3.repository.PostRepo;
import edu.miu.WAALab3.repository.UserRepo;
import edu.miu.WAALab3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
   @Autowired
    UserRepo userRepo;
    @Autowired
    private PostRepo postRepo;

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User getByID(long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public List<Post> findPosts(long id) {
        return userRepo.findById(id).orElse(null).getPosts();
    }

    @Override
    public List<User> findUserByPostsGreaterThan(int n) {
        return userRepo.findUserByPostsGreaterThan(n);
    }
}
