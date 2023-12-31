package ru.netology.service;

import ru.netology.exception.NotFoundException;
import ru.netology.model.Post;
import ru.netology.repository.PostRepository;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class PostService {

    private final PostRepository repository;

    public PostService(PostRepository repository) {
        this.repository = repository;
    }


    public Collection<Post> all() {
        return repository.all();

    }

    public Post getById(long id) {
        return repository.getById(id).orElseThrow(NotFoundException::new);
    }

    public Post save(Post post) {
        return repository.save(post);
    }

    public void removeById(long id) {
        repository.removeById(id);
    }
}

