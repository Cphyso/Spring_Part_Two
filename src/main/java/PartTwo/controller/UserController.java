package PartTwo.controller;

import PartTwo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @GetMapping("/user/{id}")
    public String findUserById(@PathVariable long id){
        System.out.println("Searching by ID : " + id);
        return userService.getUser(id);
    }
}
