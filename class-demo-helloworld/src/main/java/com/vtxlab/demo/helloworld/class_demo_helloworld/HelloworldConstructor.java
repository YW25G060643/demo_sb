package com.vtxlab.demo.helloworld.class_demo_helloworld;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@ResponseBody
public class HelloworldConstructor {
    @GetMapping(value = "/greeting")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping(value = "Integer")
    public Integer getInteger() {
        return 2;
    }

    @GetMapping(value = "/intengers")
    public Integer[] getIntegers() {
        return new Integer[]{2, 333, 555555};
    }

    @GetMapping(value = "/cats")
    public List<Cat> getList() {
        return Arrays.asList(null);
    }
    
    
    
}
