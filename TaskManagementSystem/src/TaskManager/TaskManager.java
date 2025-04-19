package TaskManager;

import java.util.LinkedList;
import java.util.Queue;

public class TaskManager {
	private Queue<Task> taskQueue;
	  
	public TaskManager() {
		taskQueue = new LinkedList<>();
	}

	public Queue<Task> getTaskQueue() {
		return taskQueue;
	}

	public void setTaskQueue(Queue<Task> taskQueue) {
		this.taskQueue = taskQueue;
	}

	public void addTask(Task task) {
		taskQueue.add(task);
	}
	public Task removeTask() {
		return taskQueue.poll();
	}
	
	public void setStatus(Task task, String status) {
		task.setStatus(status);
	}

	public void displayAllTasks() {
		if (taskQueue.isEmpty()) {
			System.out.println("No tasks in the queue.");
		} else {
			for (Task task : taskQueue) {
				System.out.println(task);
			}
		}
	}

	public void displayNext() {
		Task nextTask = taskQueue.peek();
		if (nextTask == null) {
			System.out.println("No tasks in the queue.");
		} else {
			System.out.println("Next task: " + nextTask);
		}
	}

	public void displayAllCompleted() {
		boolean hasCompletedTasks = false;
		for (Task task : taskQueue) {
			if ("completed".equalsIgnoreCase(task.getStatus())) {
				System.out.println(task);
				hasCompletedTasks = true;
			}
		}
		if (!hasCompletedTasks) {
			System.out.println("No completed tasks.");
		}
	}
}
