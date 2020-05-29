package com.godmomentsbackend.controllers;


import com.godmomentsbackend.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/Users")

public class UsersController {

    @Autowired
    private UsersRepository UsersRepository;

}
