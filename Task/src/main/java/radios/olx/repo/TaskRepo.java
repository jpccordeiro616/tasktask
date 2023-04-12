package radios.olx.repo;

import org.springframework.data.repository.CrudRepository;

import radios.olx.entity.Post;

public interface TaskRepo extends CrudRepository<Post, Integer>{

}
