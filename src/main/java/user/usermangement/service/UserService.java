package user.usermangement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.usermangement.entity.User;
import user.usermangement.repo.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> saveUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "User Removed !!" + id;
    }

    public User updateUser(User user) {

        User existingUser = userRepository.findById(user.getId()).orElse(null);

        existingUser.setUserName(user.getUserName());
        existingUser.setUserMob(user.getUserMob());
        existingUser.setUserAddr(user.getUserAddr());

        return userRepository.save(existingUser);
    }

}
