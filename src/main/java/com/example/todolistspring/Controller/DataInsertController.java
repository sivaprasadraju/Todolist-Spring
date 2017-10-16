package com.example.todolistspring.Controller;

import com.example.todolistspring.representation.PostDto;
import com.example.todolistspring.service.PostService;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/post")
public class DataInsertController {

    private PostService postService;
    private static final Logger logger = LoggerFactory.getLogger(DataInsertController.class);
    DataInsertController(PostService postService){
        this.postService=postService;
    }

    @PostMapping(produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public PostDto save(@RequestBody PostDto postDto) {
        return postService.save(postDto);
    }
}