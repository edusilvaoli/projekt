package com.example.projekt.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.projekt.entity.User;
import com.example.projekt.repository.UserRepository;

@Component
public class DataInitilizr implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UserRepository userRepository;

	
	/* Faz inicializar a aplicação antes de carregar */
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		List<User> users = userRepository.findAll(); 
		
		if (users.isEmpty()) {
			User user = new User(); 
		
			createUser("Teste","teste@teste.com");
			createUser("Teste 2","teste2@teste.com");
			createUser("Teste 4","teste4@teste.com");
		}
		
		//User user = userRepository.getOne(2L);
		/*List<User> usersall = userRepository.findByNameIgnoreCaseLike("Teste");
		
		for (User user: usersall) {
		  System.out.println("E-mail"+user.getEmail());
		}*/
		
		User user = userRepository.findByEmailQualquerCoisa("teste2@teste.com"); 
		System.out.println(user.getName());
		
		
	}
	
	public void createUser(String name, String email) {
		User user = new User(name,email); 
		
		userRepository.save(user); 
	}

}
