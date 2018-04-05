package com.example.projekt.repository;

import java.util.List;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.projekt.entity.User;

//public interface UserRepository extends JpaRepository<User, Long> {
public interface UserRepository extends MongoRepository<User, Long> {
	
	/*@Query("select u from User u where u.name = ?1")
	User findByNameQualquerCoisa(String nome);*/ 
	List<User> findByNameIgnoreCaseLike(String name);
	
	@Query("{'email' : ?0}")
	User findByEmailQualquerCoisa(String email);
}
