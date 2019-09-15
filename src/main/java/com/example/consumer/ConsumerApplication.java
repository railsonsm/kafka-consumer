package com.example.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class ConsumerApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

	@KafkaListener(topics = "estudo-kafka", groupId = "g1")
	public void listen(String message) {
		System.out.println("Grupo G1: " + message);
	}
	
	@KafkaListener(topics = "estudo-kafka", groupId = "g2")
	public void listenG2(String message) {
		System.out.println("Grupo G2: " + message);
	}

}
