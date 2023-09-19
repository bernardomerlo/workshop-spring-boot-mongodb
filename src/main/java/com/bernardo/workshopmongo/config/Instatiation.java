package com.bernardo.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.bernardo.workshopmongo.domain.User;
import com.bernardo.workshopmongo.repository.UserRespository;

@Configuration
public class Instatiation implements CommandLineRunner {

	@Autowired
	private UserRespository userRepository;

	@Override
	public void run(String... args) throws Exception {

		userRepository.deleteAll();
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Camilly", "camilly@gmail.com");

		userRepository.saveAll(Arrays.asList(maria, alex, bob));

	}

}
