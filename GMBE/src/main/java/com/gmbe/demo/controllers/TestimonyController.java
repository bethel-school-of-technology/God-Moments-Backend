package com.gmbe.demo.controllers;

import java.util.List;

//Testimony Stream Postings functionality

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gmbe.demo.models.Testimony;
import com.gmbe.demo.repository.TestimonyRepository;
    @RestController 
    public class TestimonyController {
    	@Autowired 
    	TestimonyRepository testimonyRepository;
    	// local host:8080/chat
    	@GetMapping("/testimonystream")
    	public List<Testimony> getTestimony() {
    		Testimony testimony = new Testimony();
    		testimony.setName("Javier");
    		testimony.setTestimony("Got saved in College");
    		testimonyRepository.save(testimony);
    		return testimonyRepository.findAll();
    	}
    	@GetMapping("/testimonystream/{id}")
    	public Testimony getTestimony(@PathVariable Integer id) {
    		Testimony foundTestimony = testimonyRepository.findById(id).orElse(null);
    		return foundTestimony;
    	}
    	@PostMapping("/testimonystream")
    	public Testimony makeTestimony(@RequestBody Testimony testimony) {
    		testimonyRepository.save(testimony);
    		return testimony;
    	}
    	@DeleteMapping("/testimonystream/{id}")
    	public Testimony deleteTestimony(@PathVariable Integer id) {
    		Testimony foundTestimony = testimonyRepository.findById(id).orElse(null);
    		testimonyRepository.delete(foundTestimony);
    		return foundTestimony;
    	}
    	
    }  	
    

