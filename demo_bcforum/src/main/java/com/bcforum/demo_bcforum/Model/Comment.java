package com.bcforum.demo_bcforum.Model;

public class Comment {
    private Long id; 
    private Long postId;
    private String name;
    private String email;
    private String body;

    public Long getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public Long getPostId(){
        return postId;
    }

    public void setPostId(){
        this.postId = postId;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(){
        this.email = email;
    }

    public String getBody(){
        return body;
    }

    public void setBody(){
        this.body = body;
    }

}
