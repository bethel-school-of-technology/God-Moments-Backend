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

import com.gmbe.demo.models.Message;
import com.gmbe.demo.repository.MessageRepository;
    @RestController 
    public class MessageController {
    	@Autowired 
    	MessageRepository messageRepository;
    	// local host:8080/chat
    	@GetMapping("/chat")
    	public List<Message> getMessages() {
//    		Message message = new Message();
//    		message.setName("Javier");
//    		message.setContent("cool");
//    		messageRepository.save(message);
    		return messageRepository.findAll();
    	}
    	@GetMapping("/chat/{id}")
    	public Message getMessage(@PathVariable Integer id) {
    		Message foundMessage = messageRepository.findById(id).orElse(null);
    		return foundMessage;
    	}
    	@PostMapping("/chat")
    	public Message makeMessage(@RequestBody Message message) {
    		messageRepository.save(message);
    		return message;
    	}
    	@DeleteMapping("/chat/{id}")
    	public Message deleteMessage(@PathVariable Integer id) {
    		Message foundMessage = messageRepository.findById(id).orElse(null);
    		messageRepository.delete(foundMessage);
    		return foundMessage;
    	}
    	@PutMapping ("/chat/{id}")
    	public Message updateMessage(@PathVariable Integer id,@RequestBody Message message) {
    		Message foundMessage = messageRepository.findById(id).orElse(null);
    		foundMessage.setName(message.getName());
    		foundMessage.setContent(message.getContent());
    		messageRepository.save(foundMessage);
    		return foundMessage;
    	}
    }  	
    
