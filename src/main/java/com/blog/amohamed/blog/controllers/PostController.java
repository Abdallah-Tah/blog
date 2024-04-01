package com.blog.amohamed.blog.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.blog.amohamed.blog.models.Post;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private List<Post> posts = new ArrayList<>();

    @PostMapping
    public Post createPost(@RequestBody final Post post) {
        posts.add(post);
        return post;
    }

    @GetMapping
    public List<Post> getPosts() {
        return posts;
    }

    @GetMapping("/{id}")
    public Post getPost(@PathVariable final int id) {
        return posts.get(id);
    }

    @PutMapping("/{id}")
    public Post updatePost(@PathVariable final int id, @RequestBody final Post post) {
        posts.set(id, post);
        return post;
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable final int id) {
        posts.remove(id);
    }    
}
