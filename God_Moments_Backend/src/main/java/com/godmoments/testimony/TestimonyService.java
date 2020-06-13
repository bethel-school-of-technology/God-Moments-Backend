package com.godmoments.testimony;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestimonyService {
    private final TestimonyRepository repository;

    @Autowired
    public TestimonyService(TestimonyRepository repository) {
        this.repository = repository;
    }

    public TestimonyRepository getRepository() {
		return repository;
	}

	public String getTestimony() {
        return "";
    }
}