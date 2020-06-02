package com.godmomentsbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godmomentsbackend.repository.PostRepository;

@Service
public class PostService {
    private final PostRepository repository;

    @Autowired
    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public PostRepository getRepository() {
		return repository;
	}

	public String getPost() {
        return "";
    }
}