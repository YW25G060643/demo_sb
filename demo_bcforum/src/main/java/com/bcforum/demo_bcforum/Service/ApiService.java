package com.bcforum.demo_bcforum.Service;

import java.util.List;

import com.bcforum.demo_bcforum.Model.Comment;
import com.bcforum.demo_bcforum.Model.Post;
import com.bcforum.demo_bcforum.Model.User;

public interface ApiService {
    List<User> getAllUsers();
    List<Post> getAllPosts();
    List<Comment> getAllcComments();
    List<Comment> getAllComments();
}
