package com.bcforum.demo_bcforum.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.bcforum.demo_bcforum.Model.Comment;
import com.bcforum.demo_bcforum.Model.Post;
import com.bcforum.demo_bcforum.Model.User;
import com.bcforum.demo_bcforum.Service.ApiService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private ApiService ApiService;

    @GetMapping("/Users")
    public List<User> getAllUsers(){
        return ApiService.getAllUsers();
    }
    @GetMapping("/Post")
    public List<Post> getAllPosts(){
        return ApiService.getAllPosts();
    }
    @GetMapping("/Comment")
    public List<Comment> getAllComments(){
        return ApiService.getAllComments();
    }

    @GetMapping("/all")
    public List<User> GetAllData(){
        List<User> users = apiService.getAllUsers();
        for (User user : users) {
            user.SetPosts(apiService.getAllPosts().stream()
              .filter(post -> post.getUserId().equals(user.getId()))
              .collect(Collectors.toList()));
            for (Post post : user.getPosts()) {
                post.setComments(apiService.getAllComments().stream()
                    .filter(comment -> comment.getPostId().equals(post.getID))
                    .collect(Collectors.toList()));
            }
        }
    }
}
