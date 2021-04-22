package com.porodnov.hibernate.pojo;

public class TaskClass {
    private int id;
    private String taskName;
    private String owner;
    private int priority;

    public TaskClass() {
    }

    public TaskClass(int id, String taskName, String owner, int priority) {
        this.id = id;
        this.taskName = taskName;
        this.owner = owner;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
