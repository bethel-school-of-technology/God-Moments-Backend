package com.godmomentsbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godmomentsbackend.repositories.HomeRepository;

@Service
public class HomeService {

	private final HomeRepository repository;
	
	@Autowired
	public HomeService(HomeRepository repository) {
		this.repository = repository;
	}
	
	public String getHome() {
		return "";
	}

	public HomeRepository getRepository() {
		return repository;
	}
}
