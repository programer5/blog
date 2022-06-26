package com.blog.controller;

import com.blog.domain.Post;
import com.blog.request.PostCreate;
import com.blog.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping("/posts")
    public void post(@RequestBody @Valid PostCreate postCreate) {
        postService.write(postCreate);
    }

    @GetMapping("/posts/{postId}")
    public Post get(@PathVariable Long postId) {
        Post post = postService.get(postId);
        return post;
    }

}
