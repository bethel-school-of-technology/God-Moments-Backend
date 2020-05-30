package com.godmomentsbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.godmomentsbackend.repositories.UsersRepository;

@CrossOrigin
@RestController
@RequestMapping("/Users")

public class UserController {

	@Autowired
	private UsersRepository repository;

	public UsersRepository getRepository() {
		return repository;
	}

	public void setRepository(UsersRepository repository) {
		this.repository = repository;
	}
}
