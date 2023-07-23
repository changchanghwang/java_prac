package practice.spring_boot_prac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import practice.spring_boot_prac.domain.User;
import practice.spring_boot_prac.service.UserService;

import java.util.List;

@Controller //component scan 방식으로 스프링 빈으로 자동등록이 되며 의존관계가 설정된다. @Component
public class UserController {
  private final UserService userService;

  @Autowired //DI. spring container에 있는 해당 빈을 찾아 injection해준다.
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/users")
  @ResponseBody
  public List<User> list() {
    return userService.findUsers();
  }

  @PostMapping("/users")
  @ResponseBody
  public Long create(@RequestBody UserForm form) {
    User user = new User();
    user.setName(form.getName());
    return userService.join(user);
  }

  @GetMapping("users/{id}")
  @ResponseBody
  public User retrieve(@PathVariable Long id){
    User user = userService.findOne(id).get();
    System.out.println(user.getName());
    return user;
  }
}
