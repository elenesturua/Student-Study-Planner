import java.time.LocalDate;


public class Task {
    private String taskName;
    private int taskId;
    private int taskPriority;
    private String subject;
    private LocalDate dueDate;
    private boolean completed;
}

public Task(String taskName, int taskId, int taskPriority, String subject, LocalDate dueDate){
    this.taskName=taskName;
    this.taskId=taskId;
    this.taskPriority=taskPriority;
    this.subject=subject;
    this.dueDate=dueDate;
    this.completed=false;
}



public String getTaskName() {
    return taskName;
}
public int getTaskId(){
    return taskId;
}

public int getTaskPriority(){
    return taskPriority;
}
public String subject(){
    return subject;
}

public getDueDate() {
    return dueDate;
}

public boolean isCompleted (){
    return isCompleted;
}

public void setTaskId(int taskId) {
    this.taskId = taskId;
}

public void setTaskPriority(int taskPriority) {
    this.taskPriority = taskPriority;
}

public void setSubject(String subject) {
    this.subject = subject;
}

public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
}

public void setCompleted(boolean completed) {
    this.completed = completed;
}

public void markComplete() {
    this.completed = true;
}

@Override
public String toString(){
    return taskName + " | " + subject + " | Due: " + dueDate + " | Priority: " + priority + " | Completed: " + completed;
}



