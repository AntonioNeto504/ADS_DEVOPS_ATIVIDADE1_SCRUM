package SrcumJava;

public class Task {
    private String description;
    private boolean completed;
  
    public Task(String description, boolean completed){
     this.completed = completed;
     this.description = description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCompleted(boolean completed) {
     this.completed = completed;
 }
    public String getDescription() {
        return description;
    }    
    public boolean isCompleted() {
        return completed;
    }
  
    public void mark_as_completed(){
     this.completed = true;
    }
 }
