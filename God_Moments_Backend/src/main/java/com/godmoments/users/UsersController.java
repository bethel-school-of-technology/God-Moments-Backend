package com.godmoments.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.godmoments.users.Users;
import com.godmoments.users.UserRepository;

@RestController
public class UsersController {

	 @Autowired
	    UserRepository dao;

	    @GetMapping("/Users")
	    public List<Users> getUsers() {
	        List<Users> foundMessages = dao.findAll();
	        return foundMessages;
	    }

	    @GetMapping("/Users/{id}")
	    public ResponseEntity<Users> getUsers(@PathVariable(value="id") Integer id) {
	        Users foundMessage = dao.findById(id).orElse(null);

	        if(foundMessage == null) {
	            return ResponseEntity.notFound().header("Message","Nothing found with that id").build();
	        }
	        return ResponseEntity.ok(foundMessage);
	    }

	    @PostMapping("/users")
	    public ResponseEntity<Users> postMessage(@RequestBody Users message) {

	        // saving to DB using instance of the repo interface
	        Users createdMessage = dao.save(message);

	        // RespEntity crafts response to include correct status codes.
	        return ResponseEntity.ok(createdMessage);
	    }

	    @DeleteMapping("/users/{id}")
	    public ResponseEntity<Users> deleteMessage(@PathVariable(value="id") Integer id) {
	        Users foundMessage = dao.findById(id).orElse(null);

	        if(foundMessage == null) {
	            return ResponseEntity.notFound().header("Message","Nothing found with that id").build();
	        }else {
	            dao.delete(foundMessage);
	        }
	        return ResponseEntity.ok().build();
	    }
	}

