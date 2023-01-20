package edu.miu.WAALab2.Controller;

import edu.miu.WAALab2.Domain.User;
import edu.miu.WAALab2.Domain.Post;
import edu.miu.WAALab2.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAll(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User getByID(@PathVariable("id") long id){
        return userService.getById(id);
    }

    @PostMapping
    public void create(@RequestBody User user){
        userService.save(user);
    }

    @GetMapping("/{id}/posts")
    public List<Post>getPosts(@PathVariable("id") long id){
        return userService.findPosts(id);
    }

}
