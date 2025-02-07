package com.bootcamp.demo.demo_sb_restful.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.demo_sb_restful.model.Cat;
import com.bootcamp.demo.demo_sb_restful.model.CatDatabase;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


// Controller -> The ways to control Cat resource
// insert, update, delete, select
@Controller
@ResponseBody
public class CatController {
  // insert
  @PostMapping(value = "/cat")
  public Cat createCat(@RequestBody Cat cat) {
    if (CatDatabase.put(cat))
      return cat;
    return null;
  }

  // Get All Cats
  @GetMapping(value = "/cats")
  public List<cat> geCats() {
      return Arrays.asList(CatDatabase.HOME);
  }

  //get cat by id
  @GetMapping(value = "/cats")
  public Cat geCats(@RequestParam Long id) {
    return CatDatabase.find(id).orElse(null);
  }

  @DeleteMapping(value = "/cat")
  public Boolean deleteCat(RequestParam long id){
    return CatDatabase
  }
  //hashmap.put()-> if exits, override, 
  @PutMapping
}