package com.bcforum.demo_bcforum.Model;

public class User {
    private Long id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;

    public void setId(){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setName(){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setUerName(){
        this.username = username;
    }

    public String getUserName(){
        return this.username;
    }
}
