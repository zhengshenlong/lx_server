package com.bw.controller;

import com.bw.feign.StudentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/student/")
@RestController
public class ConsumerController {

       @Autowired
    private StudentFeignService studentFeignService;

       @RequestMapping("list")
    public List<String> student(){
           return  studentFeignService.selectAll();
       }
}
