package edu.miu.WAALab2.Service;

import edu.miu.WAALab2.Domain.User;
import edu.miu.WAALab2.Domain.Post;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    public List<User> findAll();
    public User getById(long id);
    public void save(User user);
    public List<Post> findPosts(long id);

}
