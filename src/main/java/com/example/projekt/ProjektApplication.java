package com.example.projekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.projekt.entity.User;
import com.example.projekt.repository.UserRepository;

@SpringBootApplication
public class ProjektApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ProjektApplication.class, args);
	}
}
