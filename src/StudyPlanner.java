public class StudyPlanner {
    private List<Task> tasks;

    public StudyPlanner(List<Task> tasks) {
        this.tasks = tasks;
    }


  public void addTask(Task task) {
      tasks.add(task);
      System.out.println(task + " added to your planner!");
    }

    public void removeTask(int index) {
      if(index>=0 && index < tasks.length){
          tasks.remove(index);
          System.out.println(tasks + " removed from your planner!");
      } else {
          System.out.println("Task not found!");
      }
    }


}