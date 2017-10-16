package com.example.todolistspring.representation;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.sql.Timestamp;
import java.util.UUID;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PostDto {

    private int id;
    private String title;
    private String priority;
    private int done;

    public PostDto() {
    }

    public PostDto(int id,String title, String priority, int done) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.done = done;
    }

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }

    public String getPriority() {
        return priority;
    }

    public int getDone() {
        return done;
    }


    @Override
    public String toString() {
        return "PostDto{" +
                "Title='" + title + '\'' +
                ", id=" + id +
                ", Priority='" + priority + '\'' +
                ", done=" + done +
                '}';
    }
}
