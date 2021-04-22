package com.porodnov.hibernate.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "task_new_table")
public class Task implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "task_name")
    private String taskName;

    @ManyToOne
    private Owner owner;

    private int priority;

    public Task() {
    }

    public Task(int id, String taskName, Owner owner, int priority) {
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

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
            "id=" + id +
            ", taskName='" + taskName + '\'' +
            ", owner=" + owner +
            ", priority=" + priority +
            '}';
    }
}
