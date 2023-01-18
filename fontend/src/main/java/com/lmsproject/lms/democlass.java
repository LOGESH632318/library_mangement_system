package com.lmsproject.lms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class democlass {

	@GetMapping("/getMessage")
	public String getMessage() {
		return "Welcome To My channel";
	}
}
