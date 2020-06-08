package com.godmomentsbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.godmomentsbackend.services.FAQService;

@Controller
public class FAQController {
private final FAQService service;

@Autowired
	public FAQController(FAQService service) {
	this.service = service;
}

public String getFAQ() {
	return service.getFAQ();
}
}



