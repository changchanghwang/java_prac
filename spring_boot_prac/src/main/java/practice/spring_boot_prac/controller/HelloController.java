package practice.spring_boot_prac.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping("/hello")
  public String hello(){
    return "hello world";
  }
}
