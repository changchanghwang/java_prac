package practice.spring_boot_prac;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import practice.spring_boot_prac.repository.MemoryUserRepository;
import practice.spring_boot_prac.repository.UserRepository;
import practice.spring_boot_prac.service.UserService;


/**
 * spring bean에 수동으로 등록하기
 */
@Configuration
public class SpringConfig {

  @Bean
  public UserService userService() {
    return new UserService(userRepository());
  }

  @Bean
  public UserRepository userRepository() {
    return new MemoryUserRepository();
  }

}
