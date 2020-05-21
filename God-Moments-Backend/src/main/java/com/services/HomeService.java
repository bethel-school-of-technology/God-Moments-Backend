package com.services;

import com.godmomentsbackend.repositories.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}