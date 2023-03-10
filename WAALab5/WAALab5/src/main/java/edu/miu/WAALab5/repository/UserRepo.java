package edu.miu.WAALab5.repository;

import edu.miu.WAALab5.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    List<User> findUserByPostsGreaterThan(long n);
    @Query("select u from User u where u.posts>:num")
    public List<User> getUserByPosts(@Param("num") int num);
    public User findByEmail(String user);

}
