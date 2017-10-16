package com.example.todolistspring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PostEntity{

    @Id
    private int id;

    private String title;

    private String priority;

    private int done;

    public PostEntity() {
    }

    public PostEntity(int id,String title, String priority,int done) {

        this.id = id;
        this.title = title;
        this.priority= priority;
        this.done = done;

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPriority() {
        return priority;
    }

    public int getDone() {
        return done;
    }

}

