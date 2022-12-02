package com.example.BusinessOpportunity.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.BusinessOpportunity.Model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer>{

	// JPQL != SQL
//		@Query
//		("SELECT s.username, s.password FROM users s WHERE s.username = :username AND s.password = :password")
//		UserModel login(String username, String password);
	//Optional<UserModel> findByUsernamePassword(String ...);
}
