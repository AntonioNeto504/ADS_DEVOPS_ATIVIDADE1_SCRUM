package SrcumJava;

import java.util.ArrayList;
import java.util.Scanner;
 
public class ScrumBoard {
    Scanner input = new Scanner(System.in);
    ArrayList<Task> tasksList = new ArrayList<>();
 
    public void add_task(Task tasks){
        tasksList.add(tasks);
    }
    public void view_tasks(){
        System.out.println("Tasks Implementadas");
        for (Task task : tasksList) {
            System.out.println("Description: " + task.getDescription() + ".");
        }
       
    }
    public void mark_task_completed(int taskIndex){
        tasksList.get(taskIndex).mark_as_completed();
    }
}
