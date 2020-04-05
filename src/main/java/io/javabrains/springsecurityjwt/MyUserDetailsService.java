package io.javabrains.springsecurityjwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.javabrains.springsecurityjwt.models.Usert;
import io.javabrains.springsecurityjwt.models.myUserDetail;
import repository.UserRepository;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

    	Optional<Usert> user = userRepository.findByName(userName);
    	System.out.println("**************");
    	user.orElseThrow(() -> new UsernameNotFoundException("Not Found " + userName));
    	return user.map(myUserDetail :: new).get();
    	//        return new User("foo", "foo",
//                new ArrayList<>());
    }
}