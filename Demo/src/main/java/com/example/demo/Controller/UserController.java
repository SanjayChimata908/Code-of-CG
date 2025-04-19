package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;

@RestController
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		
		this.userService = userService;
	}
	
	@GetMapping("/user")
	public User getuser(@RequestParam Integer Id){
		Optional<User> user = userService.getuser(Id);
		
		if(user.isPresent()) {
			return (User) user.get();
		}
		
		return null;
		
	}
	
}
