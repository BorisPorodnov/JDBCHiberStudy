package com.porodnov.hibernate.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "owner_table")
public class Owner implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "owner_name")
    private String ownerName;

    @OneToMany(mappedBy = "owner")
    private Set<Task> tasks;

    public Owner() {
    }

    public Owner(int id, String ownerName, Set<Task> tasks) {
        this.id = id;
        this.ownerName = ownerName;
        this.tasks = tasks;
    }

    public Owner(String ownerName, Set<Task> tasks) {
        this.ownerName = ownerName;
        this.tasks = tasks;
    }

    public Owner(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

}
