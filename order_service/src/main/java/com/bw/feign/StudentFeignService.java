package com.bw.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "student-service")
public interface StudentFeignService {

    @RequestMapping("/student/list")
    public List<String> selectAll();
}
