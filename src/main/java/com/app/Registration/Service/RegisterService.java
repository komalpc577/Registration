package com.app.Registration.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Registration.Model.User;
import com.app.Registration.Repository.RegistrationRepository;

@Service
public class RegisterService {
	
	@Autowired
	private RegistrationRepository repo;
	
	public User saveUser(User user) {
		
		return repo.save(user);
	}
	public User fetchUserByUsername(String username) 
	{
		return repo.findByUsername(username);
		
	}
	public User fetchUserByUsernameAndPassword(String username,String password) 
	{
		return repo.findByUsernameAndPassword(username, password);
		
	}
}
