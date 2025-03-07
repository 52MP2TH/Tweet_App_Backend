package com.example.demo.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@Profile("local")
public class KafkaConfig {
	@Bean
	public NewTopic libraryEvents() {
		return TopicBuilder.name("test-tweets").partitions(1).replicas(1).build();
	}

}
