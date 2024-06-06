package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface UserRepository extends MongoRepository<User,String>{

	User findTweetsByuserName(String username);

	@Query("{'username': ?0, 'password': ?1}")
	User findUserByUserNameAndPassword(String username, String password);

	@Query("{'username':{'$regex':'?0','$options':'i'}}")  
	List<User> findUserByName(String userName);

	@Query("{'username': ?0}")
	User findUserByUserName(String username);
	
	@Query("{'userId':?0}")
	User findById(int userId);
}
