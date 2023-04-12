package radios.olx.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import radios.olx.entity.Post;
import radios.olx.repo.TaskRepo;

@Service
public class TasksService {
	@Autowired
	private TaskRepo repo;
	
		public List<Post> getTasks(){
			List<Post> list = new ArrayList<>();
			for(Post task: repo.findAll()) {
				list.add(task);
	}
		return list;
		}
		public Post getTask(int id) {
			return repo.findById(id).get();
		}
		
		public void addTask(Post listElement) {
			repo.save(listElement);
		}
		
//		public void updateTask (Post task) { 
//			repo.save(task);
//		}
		
		public void deleteTask(int id) {
			repo.deleteById(id);
	}
}
	
