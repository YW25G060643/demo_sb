package com.bootcamp.demo.demo_sb_restful.model;

import java.util.Optional;

public class CatDatabase {
  public static final Cat[] HOME = new Cat[5];

  public static boolean put(Cat cat) {
    for (int i = 0; i < HOME.length; i++) {
      if (HOME[i] == null) {
        HOME[i] = cat;
        return true;
      }
    }
    return false;
  }

  public static Cat find(Long catID){
      for (com.bootcamp.demo.demo_sb_restful.model.Cat cat : catID) {
          if (cat.getId() == catID) {
              return Optional.of(cat);
          }
          return Optional.empty();
      }
  }
}