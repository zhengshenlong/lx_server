package com.bw.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/student/")
public class StudentController {

     @RequestMapping("list")
    public List<String> selectAll(){
         return Arrays.asList("郑申龙");
     }

}
