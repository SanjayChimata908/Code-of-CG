package TaskManager;

public class Task {

	private  String title;
	private String description;
	private int priority;
    private String status;

    public Task(String title, String description, int priority, String status) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task[title=" + title + ", description=" + description + ", priority=" + priority + ", status=" + status + "]";
    }
}
