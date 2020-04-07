package io.javabrains.springsecurityjwt.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.javabrains.springsecurityjwt.models.User;


@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	Optional<User> findByEmail(String userName);

	

	
	
	

}
