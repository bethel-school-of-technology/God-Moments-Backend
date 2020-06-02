package com.godmomentsbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godmomentsbackend.repository.FAQRepository;

@Service
public class FAQService {
private final FAQRepository repository;

@Autowired
public FAQService(FAQRepository repository) {
    this.repository = repository;
}

public FAQRepository getRepository() {
	return repository;
}

public String getFAQ() {
    return "";
}
}