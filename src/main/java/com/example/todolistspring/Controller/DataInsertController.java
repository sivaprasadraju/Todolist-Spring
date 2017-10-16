package com.example.todolistspring.Controller;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/feedback")
public class DataInsertController {

    private static final Logger logger = LoggerFactory.getLogger(DataInsertController.class);
    DataInsertController(){
    }

    @PostMapping(produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public String save(@RequestBody Feed feed) {
        return feed.toString();
    }
}
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
class Feed{
    private String s;
    Feed(){
    }
    public String toString(){
        return "{\"status\":"+"\""+s+"\"}";
    }
}