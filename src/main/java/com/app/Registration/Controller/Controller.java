package com.app.Registration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.Registration.Model.User;
import com.app.Registration.Service.RegisterService;

@RestController
public class Controller {

	
	@Autowired
	 private RegisterService service;
	
	@PostMapping("/registerUser")
	
	public User registerUser(@RequestBody User user) throws Exception {
		String tempUsername=user.getUsername();
		if(tempUsername !=null && " ".equals(tempUsername)) {
			User userobj=service.fetchUserByUsername(tempUsername);
			if(userobj !=null) {
				throw new Exception("user with" +tempUsername+ "is already exist");
			}
		}
		User userObj=null;
		
		userObj=service.saveUser(user);
		return userObj;
		
	}
	@PostMapping("/login")

	
	public User loginUser(@RequestBody User user) throws Exception {
		String tempUsername=user.getUsername();
		String tempPass=user.getPassword();
		User userObj=null;
		if(tempUsername !=null && tempPass !=null) 
		{
			service.fetchUserByUsernameAndPassword(tempUsername,tempPass);
		}
			if(userObj ==null) {
				throw new Exception("Bad credentials");
			}
			return userObj;
		}
		
		
	}

