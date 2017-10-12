package com.example.todolistspring.service;

import com.example.todolistspring.model.Todo;
import com.example.todolistspring.Repository.TodoRepository;
import com.example.todolistspring.representation.TodoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

//import static com.example.todolistspring.service.ObjectConverter.dto;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getTodos() {
        List<Todo> todos = todoRepository.findAll();
        return todos;
          //return todos.collect(Collectors.toList());
//        return todos.stream().map(ObjectConverter::dto)
//                .collect(Collectors.toList());
    }

//    public TodoDto getTodo(int todoId) {
//        Todo todo = todoRepository.findOne(todoId);
//        return dto(todo);
//    }
}
