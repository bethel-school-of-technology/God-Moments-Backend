package com.godmomentsbackend.controllers;

import com.godmomentsbackend.services.FAQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FAQController {
	private final FAQService service;	
	
	@Autowired
	public FAQController(FAQService service) {
	this.service = service;
	}
	public String getFAQ() {
		return "service.getFAQ";
	}
}
