package com.jalivv.tran.controller;

import com.jalivv.tran.entity.User;
import com.jalivv.tran.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * (user1)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/list")
    public List<User> list() {
        return userService.list();
    }

}
