package ua.lviv.iot.spring.first.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "ua.lviv.iot.spring.first.rest.dataaccess", "ua.lviv.iot.spring.first.rest.business",
        "ua.lviv.iot.spring.first.rest.controller" })
@EnableJpaRepositories("ua.lviv.iot.spring.first.rest.dataaccess")
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}
