package com.example.BusinessOpportunity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BusinessOpportunity.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository; 
	
	hashPassword hashAPassword = new hashPassword();
	
	//temporal service, until further development it will check String
	public boolean checkLogin(String username, String password) {
		String passwordHashed =hashAPassword.hashing(password);
		String passwordStored = hashAPassword.hashing("Bootcamp4");
		boolean response;
			if (username.equals("Solera@solera.com") && passwordHashed.equals(passwordStored)) {
				response= true;
			}else {
				response = false;
			}
		return response;
	}
}
