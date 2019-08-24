package com.muthu.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MuthuController {

	@GetMapping("/getDetails")
	public ResponseEntity<?> getDetails() {
		return ResponseEntity.ok("first message");
	}
}
