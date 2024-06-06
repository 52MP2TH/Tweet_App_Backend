package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Tweet;
import com.example.demo.model.Reply;

@Repository
public interface ReplyRepository extends MongoRepository<Reply,String>{
	
	@Query("{'tweetId': ?0}")
	List<Reply> findReplyByTweet(String tweetId);

}
