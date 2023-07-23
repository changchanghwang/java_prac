package practice.spring_boot_prac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

  @GetMapping("/hello")
  @ResponseBody
  public String hello(@RequestParam("name") String name) {
    return "hello " + name;
  }

  @GetMapping("/hello-api")
  @ResponseBody
  public Hello HelloApi(@RequestParam("name") String name) {
    Hello hello = new Hello();
    hello.setName(name);
    System.out.println(hello.name);
    return hello;
  }

  static class Hello {
    private String name;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }
}
