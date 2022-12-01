package com.example.BusinessOpportunity.UserTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import Model.UserModel;
import Service.UserService;

class TestUsers {

	static UserService userService;
	@BeforeAll
	public static void setUp() throws Exception {
		userService = new UserService();
	}
	
	//Test cases
	private static Stream<Arguments> userOfTesting(){
		return Stream.of(
				Arguments.of(new UserModel(1,"Solera@solera.com","Bootcamp4")),
				Arguments.of(new UserModel(2,"Alcachofa","piranhaconda")) );
	}

	@ParameterizedTest
	@MethodSource("userOfTesting")
	void checkUsers(UserModel testingUser) {
		boolean SuccessfullLogin = userService.checkLogin(testingUser.getUsername(), testingUser.getPassword());
		
		assertTrue(SuccessfullLogin);
	}

}
