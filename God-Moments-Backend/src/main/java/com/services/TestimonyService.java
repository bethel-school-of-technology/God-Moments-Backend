package com.services;

import com.godmomentsbackend.repositories.TestimonyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestimonyService {
    private final TestimonyRepository repository;

    @Autowired
    public TestimonyService(TestimonyRepository repository) {
        this.repository = repository;
    }
    public String getHome() {
        return " ";
    }
}
