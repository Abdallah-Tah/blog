package com.blog.amohamed.blog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    // This method returns a list of posts.
    @GetMapping("")
    public List<Post> listPosts() {
        // This should call a service method to get the list of posts
        // Here, we're just returning an empty list as an example
        return new ArrayList<>();
    }

    // This method handles the submission of a new post. 
    @PostMapping("")
    public Post createPost(@RequestBody Post post) {
        // Here you would call a service to handle the creation of a new post
        // For now, we're just returning the received post
        return post;
    }

    // Nested class to simulate the Post entity
    public static class Post {
        // Example fields, generate getters and setters as needed
        private String title;
        private String content;

        // Getters and setters are omitted for brevity
    }
}
