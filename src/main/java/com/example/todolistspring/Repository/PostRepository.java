package com.example.todolistspring.Repository;

import com.example.todolistspring.model.PostEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<PostEntity, Integer> {

    PostEntity save(PostEntity postEntity);

}
