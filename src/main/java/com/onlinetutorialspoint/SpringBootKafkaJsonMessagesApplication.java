package com.onlinetutorialspoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;

@SpringBootApplication(exclude = KafkaAutoConfiguration.class)
public class SpringBootKafkaJsonMessagesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaJsonMessagesApplication.class, args);
	}

}
