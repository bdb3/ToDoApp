package com.sargent.mark.todolist.data;

/**
 * Created by mark on 7/4/17.
 */

public class ToDoItem {
    private String description;
    private String dueDate;
    //added boolean done, true if done(checked) or false if not done (unchecked)
    //also created getters and setters and updated default constructor
    private boolean done;
    //added string category, depends on category to do is in
    //also created getters and setters and updated default constructor
    //0 is Homework, 1 is Chores, 2 is Social, 3 is Other
    private Integer cat;

    public ToDoItem(String description, String dueDate, boolean done, Integer cat) {
        this.description = description;
        this.dueDate = dueDate;
        this.done = done;
        this.cat = cat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Integer getCat() {
        return cat;
    }

    public void setCat(Integer cat) {
        this.cat = cat;
    }
}
