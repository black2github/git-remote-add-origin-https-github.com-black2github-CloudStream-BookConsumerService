package com.example.cloudstream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
public class StoreBookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreBookServiceApplication.class, args);
	}

}
