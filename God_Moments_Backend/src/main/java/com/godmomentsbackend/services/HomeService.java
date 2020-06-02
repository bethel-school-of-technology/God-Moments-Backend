package com.godmomentsbackend.services;

import com.godmomentsbackend.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
    private final HomeRepository repository;

    @Autowired
    public HomeService(HomeRepository repository) {
        this.repository = repository;
    }

    public HomeRepository getRepository() {
		return repository;
	}

	public String getHome() {
        return "";
    }
}