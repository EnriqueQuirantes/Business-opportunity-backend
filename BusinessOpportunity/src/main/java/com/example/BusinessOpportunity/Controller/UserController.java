package com.example.BusinessOpportunity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.BusinessOpportunity.Model.UserModel;
import com.example.BusinessOpportunity.Service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/login")
	public boolean greeting(@RequestBody UserModel user) {
		String username = user.getUsername();
		String pass = user.getPassword();
		return userService.checkLogin(username, pass);
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}
