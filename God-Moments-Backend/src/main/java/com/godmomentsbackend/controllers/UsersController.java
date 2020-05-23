package com.godmomentsbackend.controllers;


import com.godmomentsbackend.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class UsersController {

    @Autowired
    private UsersRepository UsersRepository;

}
