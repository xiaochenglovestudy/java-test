package com.example.test.controller;


import com.example.test.service.DemoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "demo")
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;


}
