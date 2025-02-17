package com.bcforum.demo_bcforum.Model;

public class Post {
    private Long id;
    private Long userId;
    private String title;
    private String body;

    public void setId(){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setUserId(){
        this.userId = userId;
    }

    public Long getUserId(){
        return this.userId;
    }

    public void setTitle(){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setBody(){
        this.body = body;
    }

    public String getBody(){
        return this.body;
    }
}
