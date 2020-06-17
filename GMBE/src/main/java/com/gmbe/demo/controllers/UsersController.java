package com.gmbe.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gmbe.demo.models.Users;
import com.gmbe.demo.repository.UsersRepository;
    @RestController 
    public class UsersController {
    	@Autowired 
    	UsersRepository usersRepository;
    	// local host:8080/chat
    	@GetMapping("/users")
    	public List<Users> getUsers() {
    		Users users = new Users();
    		users.setName("Javier");
    		users.setContent("Bethel Tech Student");
    		users.setEmail("Javmartinez791@gmail.com");
    		users.setPassword("********");
    		usersRepository.save(users);
    		return usersRepository.findAll();
    	}
    	@GetMapping("/users/{id}")
    	public Users getMessage(@PathVariable Integer id) {
    		Users foundMessage = usersRepository.findById(id).orElse(null);
    		return foundMessage;
    	}
    	@PostMapping("/users")
    	public Users makeMessage(@RequestBody Users message) {
    		usersRepository.save(message);
    		return message;
    	}
    	@DeleteMapping("/users/{id}")
    	public Users deleteMessage(@PathVariable Integer id) {
    		Users foundMessage = usersRepository.findById(id).orElse(null);
    		usersRepository.delete(foundMessage);
    		return foundMessage;
    	}
    	@PutMapping ("/users/{id}")
    	public Users updateMessage(@PathVariable Integer id,@RequestBody Users message) {
    		Users foundMessage = usersRepository.findById(id).orElse(null);
    		foundMessage.setName(message.getName());
    		foundMessage.setContent(message.getContent());
    		usersRepository.save(foundMessage);
    		return foundMessage;
    	}
    }  	
    

