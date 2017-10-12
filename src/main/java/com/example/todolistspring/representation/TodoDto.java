package com.example.todolistspring.representation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoDto {
    private int id;
    private String title;
    private String priority;
    private int done;
}
