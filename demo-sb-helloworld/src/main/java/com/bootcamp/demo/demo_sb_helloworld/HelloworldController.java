package com.bootcamp.demo.demo_sb_helloworld;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.demo_sb_helloworld.ShoppMall.Cinema;
import com.bootcamp.demo.demo_sb_helloworld.ShoppMall.Cinema.Film;

// Java Object -> JSON (Serialization)
// JSON -> Java Object (Deserialization)

// List & Array (JSON)

// Attribute has no ordering in JSON.

@Controller // @GetMapping
@ResponseBody // JSON
public class HelloworldController {

  // An API for Getting Resource
  @GetMapping(value = "/iphone/greeting") // unique
  public String hello() {
    return "Hello World !";
  }

  // Create another API to return an Integer
  @GetMapping(value = "/integer")
  public Integer getInteger() {
    return 100;
  }

  // Create another API to return Integer array
  @GetMapping(value = "/integers")
  public Integer[] getIntegers() {
    return new Integer[] {3, 100, 2};
  }

  // Create another API to return List of String
  @GetMapping(value = "/strings")
  public List<String> getStrings() {
    return Arrays.asList("vincent", "lucas");
  }

  // Create another API to return a Cat
  @GetMapping(value = "/cat")
  public Cat getCat() {
    return new Cat("John", 3);
  }

  // Create another API to return a List of Cat
  @GetMapping(value = "/cats")
  public List<Cat> getCats() {
    return Arrays.asList(new Cat("John", 3), new Cat("Sally", 4));
  }

  // Create another API to return a List of LocalDate
  @GetMapping(value = "/dates")
  public List<LocalDate> getDates() {
    return Arrays.asList(LocalDate.of(2024, 11, 2), LocalDate.of(2025, 11, 2));
  }

  @GetMapping(value = "/shoppingmall")
  public ShoppMall getShopmall() {
    ShoppMall.Cinema.Film film1 = Film.builder() 
      .name("123")
      .releaseDate(LocalDate.of(2024, 10, 2))
      .build();
    ShoppMall.Cinema.Film film2 = Film.builder() 
      .name("234")
      .releaseDate(LocalDate.of(2025, 10, 2))
      .build();
    ShoppMall.Cinema cinema = Cinema.builder()
      .releasedFilms(new Film[] {film1, film2})
      .name("ABC")
      .build();
    return ShoppMall.builder()
      .name("K11")
      .area(100000)
      .cinema(cinema)
      .shopCategory(new String[] {"Clothing", "Sport"})
      .build();
  }
}
