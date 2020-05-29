package com.godmomentsbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godmomentsbackend.repositories.UsersRepository;

@Service
public class UsersService {
    private final UsersRepository repository;

    @Autowired
    public UsersService(UsersRepository repository) {
        this.repository = repository;
    }
    public String getUsers() {
        return "";
    }
	public UsersRepository getRepository() {
		return repository;
	}
}