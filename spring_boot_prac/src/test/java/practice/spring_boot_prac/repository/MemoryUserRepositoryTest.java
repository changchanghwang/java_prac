package practice.spring_boot_prac.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import practice.spring_boot_prac.domain.User;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class MemoryUserRepositoryTest {
  MemoryUserRepository repository = new MemoryUserRepository();

  @AfterEach
  public void afterEach() {
    repository.clearStore();
  }

  @Test
  public void save() {
    User user = new User();
    user.setName("spring");

    repository.save(user);
    User result = repository.findById(user.getId()).get();
    assertThat(user).isEqualTo(result);
  }

  @Test
  public void findByName() {
    User user1 = new User();
    user1.setName("spring1");
    repository.save(user1);

    User user2 = new User();
    user2.setName("spring2");
    repository.save(user2);

    User result = repository.findByName("spring1").get();
    assertThat(user1).isEqualTo(result);
  }

  @Test
  public void find() {
    User user1 = new User();
    user1.setName("spring1");
    repository.save(user1);

    User user2 = new User();
    user2.setName("spring2");
    repository.save(user2);

    List<User> result = repository.find();
    assertThat(result.size()).isEqualTo(2);
  }
}
