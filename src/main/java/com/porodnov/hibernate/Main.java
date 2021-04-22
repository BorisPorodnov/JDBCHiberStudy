package com.porodnov.hibernate;

import com.porodnov.hibernate.pojo.Task;
import com.porodnov.hibernate.utils.TaskProcess;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        TaskProcess tp = new TaskProcess();

        List<Task> list = tp.getAll();
        for (Task t :
            list) {
            System.out.println(t.getId() + " - " + t.getTaskName() + "--" + t.getOwner()+ "--"+ t.getPriority());
        }
    }


}
