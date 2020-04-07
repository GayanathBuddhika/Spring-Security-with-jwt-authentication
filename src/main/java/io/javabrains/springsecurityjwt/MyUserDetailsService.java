package io.javabrains.springsecurityjwt;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.javabrains.springsecurityjwt.models.User;
import io.javabrains.springsecurityjwt.models.myUserDetail;
import io.javabrains.springsecurityjwt.repository.UserRepository;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

    	Optional<User> user = userRepository.findByEmail(userName);
    	System.out.println("**************" + user.get().getEmail());
    	user.orElseThrow(() -> new UsernameNotFoundException("Not Found " + userName));
    	return user.map(myUserDetail :: new).get();
    	//        return new User("foo", "foo",
//                new ArrayList<>());
    }
}