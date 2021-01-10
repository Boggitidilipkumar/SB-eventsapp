package com.eventapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	@GetMapping("home")
	public String home() {
		return "welcome to hcl events page";
	}
	
	@GetMapping("admin")
	public String admin() {
		return "welcome to hcl admin page";
	}
	
	@GetMapping("emp")
	public String emp() {
		return "welcome to hcl emp page";
	}

}
