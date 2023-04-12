package radios.olx.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tasks")
public class Post {
	@Id
	@Column(name="id")
	int taskId;
	@Column(name="title")
	String Title;
	@Column(name="body")
	String body;
	public Post() {}
	public Post(int taskId, String title, String body) {
		this.taskId = taskId;
		Title = title;
		this.body = body;
		
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Post [taskId=" + taskId + ", Title=" + Title + ", body=" + body + "]";
	}
	
}
