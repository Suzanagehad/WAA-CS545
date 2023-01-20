package edu.miu.WAALab2.Repo;

import edu.miu.WAALab2.Domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends CrudRepository<Post,Long> {


}
