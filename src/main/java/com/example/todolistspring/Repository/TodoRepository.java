package com.example.todolistspring.Repository;

import com.example.todolistspring.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Integer> {

    @Override
    List<Todo> findAll();

    @Override
    Todo findOne(Integer id);

}
