package user.usermangement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import user.usermangement.entity.User;
import user.usermangement.service.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    /*
    * For Add user one by one
    * */
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    /*
     * For Add multiple user at a time
     * */
    @PostMapping("/addUsers")
    public List<User> addUsers(@RequestBody List<User> users) {
        return service.saveUsers(users);
    }

    /*
     * Show all users
     * */
    @GetMapping("/showUsers")
    public List<User> findAllUsers() {
        return service.getUsers();
    }

    /*
     * Show users by Id
     * */
    @GetMapping("/showUserById/{id}")
    public User findById(@PathVariable Long id) {
        return service.getUserById(id);
    }

    /*
     * Delete user by Id
     * */
    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable Long id) {
        return service.deleteUser(id);
    }

    /*
     * For update user by Id
     * */
    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }
}
