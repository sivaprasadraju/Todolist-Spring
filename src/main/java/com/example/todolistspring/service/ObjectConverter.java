package com.example.todolistspring.service;

import com.example.todolistspring.model.PostEntity;
import com.example.todolistspring.representation.PostDto;

public final class ObjectConverter {
    public static PostEntity domain(PostDto postDto) {
        return new PostEntity(postDto.getId(),postDto.getTitle(),
                postDto.getPriority(),
                postDto.getDone());
    }

    public static PostDto dto(PostEntity postEntity) {
        return new PostDto(
                postEntity.getId(),
                postEntity.getTitle(),
                postEntity.getPriority(),
                postEntity.getDone());

    }
}
