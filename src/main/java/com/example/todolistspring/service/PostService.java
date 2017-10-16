package com.example.todolistspring.service;

import com.example.todolistspring.Repository.PostRepository;
import com.example.todolistspring.model.PostEntity;
import com.example.todolistspring.representation.PostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.todolistspring.service.ObjectConverter.domain;
import static com.example.todolistspring.service.ObjectConverter.dto;

@Service
public class PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public PostDto save(PostDto postDto) {
        PostEntity postEntity = postRepository.save(domain(postDto));
        return dto(postEntity);
    }

}


