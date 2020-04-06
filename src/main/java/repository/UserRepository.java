package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.javabrains.springsecurityjwt.models.Usert;

@Repository
public interface UserRepository extends JpaRepository<Usert, String> {
	
	Optional<Usert> findByName(String userName);

	Usert save(Usert users);
	

}
