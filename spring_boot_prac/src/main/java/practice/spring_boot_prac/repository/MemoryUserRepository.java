package practice.spring_boot_prac.repository;

import practice.spring_boot_prac.domain.User;

import java.util.*;

public class MemoryUserRepository implements UserRepository {

  private static final Map<Long, User> store = new HashMap<>();
  private static long sequence = 0L;

  @Override
  public User save(User user) {
    user.setId(++sequence);
    store.put(user.getId(), user);
    return user;
  }

  @Override
  public Optional<User> findById(Long id) {
    return Optional.ofNullable(store.get(id));
  }

  @Override
  public Optional<User> findByName(String name) {
    return store.values().stream().filter(user -> user.getName().equals(name)).findAny();
  }

  @Override
  public List<User> find() {
    return new ArrayList<>(store.values());
  }

  public void clearStore() {
    store.clear();
  }
}
