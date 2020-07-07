package com.akash.usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.akash.usermanagement.repository.UserProfileRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserProfileRepository.class)
public class UserManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementApplication.class, args);
	}

}
