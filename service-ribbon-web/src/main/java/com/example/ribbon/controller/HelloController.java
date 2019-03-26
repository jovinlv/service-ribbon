package com.example.ribbon.controller;

import com.example.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Created by jovin .
 * @date Created on 10:40 2019/3/25.
 */
@RestController
public class HelloController {
  @Autowired
  HelloService helloService;

  @GetMapping(value = "/hi")
  public String hi(@RequestParam String name) {
    return helloService.hiService( name );
  }

}
