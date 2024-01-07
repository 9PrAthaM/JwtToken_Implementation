package com.jwtauthentication.JwtAuthentication.controller;

import com.jwtauthentication.JwtAuthentication.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/test")
    public String test() {
        logger.warn("This is working message");
        User user=new User(1,"pratham","pratham@gmail.com");
        User user1=new User(2,"amit","amit@gmail.com");
        List<User>users=new ArrayList<>();
        users.add(user);
        users.add(user1);
        return users.toString();
    }


}