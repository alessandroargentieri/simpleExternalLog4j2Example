package com.example.logging.demoLog4j;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@SpringBootApplication
public class DemoLog4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoLog4jApplication.class, args);
	}

	@RequestMapping("/logme")
	public String logme(){

		log.debug("Debugging log");
		log.info("Info log");
		log.warn("Hey, This is a warning!");
		log.error("Oops! We have an Error. OK");
		log.fatal("Damn! Fatal error. Please fix me.");

		return "log inseriti nel file";
	}
}
