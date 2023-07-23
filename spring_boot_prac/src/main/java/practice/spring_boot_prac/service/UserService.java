package practice.spring_boot_prac.service;

import practice.spring_boot_prac.domain.User;
import practice.spring_boot_prac.repository.MemoryUserRepository;
import practice.spring_boot_prac.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService {
  private final UserRepository userRepository = new MemoryUserRepository();

  /**
   * 회원가입
   */
  public Long join(User user) {

    // 중복 회원 검증
    validateDuplicateUser(user);

    userRepository.save(user);
    return user.getId();
  }

  private void validateDuplicateUser(User user) {
    this.userRepository.findByName(user.getName())
        // optional method
        .ifPresent(u -> {
          throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
  }

  public List<User> findUsers() {
    return userRepository.find();
  }

  public Optional<User> findOne(Long id){
    return userRepository.findById(id);
  }
}
