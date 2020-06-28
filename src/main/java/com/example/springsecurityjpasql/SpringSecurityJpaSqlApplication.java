package com.example.springsecurityjpasql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityJpaSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpaSqlApplication.class, args);
	}

}
