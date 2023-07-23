package practice.spring_boot_prac.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.spring_boot_prac.domain.User;
import practice.spring_boot_prac.repository.MemoryUserRepository;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserServiceTest {

  MemoryUserRepository userRepository;
  UserService userService;

  @BeforeEach
  public void beforeEach(){
    userRepository = new MemoryUserRepository();
    userService = new UserService(userRepository);
  }

  @AfterEach
  public void afterEach(){
    userRepository.clearStore();
  }



  @Test
  void join() {
    //given
    User user = new User();
    user.setName("spring");

    //when
    Long id = userService.join(user);

    //then
    Optional<User> result = userService.findOne(id);
    assertThat(id).isEqualTo(result.get().getId());
  }

  @Test
  public void duplicateException() {
    //given
    User user1 = new User();
    user1.setName("spring");

    User user2 = new User();
    user2.setName("spring");

    //when
    userService.join(user1);

//    //방법1 try catch
//    try {
//      userService.join(user2);
//      fail("예외가 발생해야 합니다.");
//    } catch (IllegalStateException e) {
//      assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
//    }
    IllegalStateException e = assertThrows(IllegalStateException.class, () -> userService.join(user2));
    assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");


    //then

  }

  @Test
  void findUsers() {
  }

  @Test
  void findOne() {
  }
}