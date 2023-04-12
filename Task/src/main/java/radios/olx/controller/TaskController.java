package radios.olx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import radios.olx.entity.Post;
import radios.olx.services.TasksService;
@RestController("/api/v1")
public class TaskController{
	@Autowired
	private TasksService service;
	
	@RequestMapping("/tasks")
	public List<Post> getTasks(){
		return service.getTasks();
	}

	@RequestMapping("/tasks/{id}")
	public Post getTask(@PathVariable int id) {
		return service.getTask(id);
	}

	@RequestMapping (method=RequestMethod. POST, value="/tasks")
	public void addTask (@RequestBody Post listElement) {
		service.addTask(listElement);
	}	
	
	@RequestMapping (method=RequestMethod. PUT, value="/tasks/{id}")
	public void updateTask (@RequestBody Post task, @PathVariable int id) { 
		task.setTaskId(id);
		service.addTask(task);
	}
	
	@RequestMapping (method=RequestMethod.DELETE, value="/tasks/{id}") 
	public void deleteTask (@PathVariable int id) {
		service.deleteTask(id);
	}

}
	