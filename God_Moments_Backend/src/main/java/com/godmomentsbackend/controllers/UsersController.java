package com.godmomentsbackend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

	@GetMapping ("/")
	public String index() {
		return "index";
	}
}
