package com.godmomentsbackend.auth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/values")
public class ValuesController {

	@GetMapping()
	public ResponseEntity<List<String>> getnames(){
		List<String> names = new ArrayList<String>();
		names.add("Pretzel");
		names.add("Truffle");
		names.add("Nugget");
		return ResponseEntity.ok(names);
	}
}
