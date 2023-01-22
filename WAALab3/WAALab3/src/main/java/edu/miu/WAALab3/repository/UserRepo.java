package edu.miu.WAALab3.repository;

import edu.miu.WAALab3.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    @Query("select u from User u where u.posts.size> :n")
    public List<User> findUserByPostsGreaterThan(@Param("n") int n);
}
