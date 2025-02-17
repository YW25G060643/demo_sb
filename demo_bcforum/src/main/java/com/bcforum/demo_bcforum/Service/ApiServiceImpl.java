package com.bcforum.demo_bcforum.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bcforum.demo_bcforum.Model.Comment;
import com.bcforum.demo_bcforum.Model.Post;

@Service
public class ApiServiceImpl implements ApiService{
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    private final RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getAllUsers(){
        return List.of(restTemplate.getForObject(BASE_URL + "/users", User[].class));
    }

    @Override
    public List<Post> getAllPosts(){
        return List.of(restTemplate.getForObject(BASE_URL + "/posts", Post[].class));
    }

    @Override
    public List<Comment> getAllComments(){
        return List.of(restTemplate.getForObject(BASE_URL + "/comments", Comment[].class));
    }

    
}
