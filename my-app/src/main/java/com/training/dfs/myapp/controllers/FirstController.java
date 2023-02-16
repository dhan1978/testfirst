package com.training.dfs.myapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to DFS...";
	}
	
	@GetMapping("/login")
	public String logIn() {
		return "<html><body><h1>Welcome to Login Page...</h1></body></html>";
	}
}
