package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Tweet;

@Repository
public interface TweetRepository extends MongoRepository<Tweet,String> {

	@Query("{'userName':{'$regex':'?0','$options':'i'}}")
	List<Tweet> findTweetsByuserName(String userName);
}
