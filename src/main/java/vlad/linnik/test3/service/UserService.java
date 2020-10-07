package vlad.linnik.test3.service;

import vlad.linnik.test3.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void save (User user);

    User getById(int id);

    void update (User user);

    void delete(int id);
}
