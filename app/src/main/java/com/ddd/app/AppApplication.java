package com.ddd.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.ddd.app", "com.ddd.shared"})
@EnableJpaRepositories /* add jpa repository from other projects ("com.ddd.something.infrastructure.persistence") */
@EntityScan /* add entities from other projects ({"com.ddd.something"}) */
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
