package com.ohai;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class MainApplication implements CommandLineRunner {

	public static void main(String[] arguments) {
		SpringApplication.run(MainApplication.class, arguments);
	}

	@Override
	public void run(String... arguments) {
		log.info("==================================================================================");
		log.info("================       Main Application Started Running ...       ================");
		log.info("==================================================================================");
	}
}
