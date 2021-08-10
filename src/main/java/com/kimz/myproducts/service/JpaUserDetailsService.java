package com.kimz.myproducts.service;

import com.kimz.myproducts.entity.User;
import com.kimz.myproducts.model.CustomUserDetails;
import com.kimz.myproducts.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

@Service
public class JpaUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public CustomUserDetails loadUserByUsername(String username){
        Supplier<UsernameNotFoundException> s = () ->new UsernameNotFoundException(
                "Problem during authentication!");
        User user = userRepository.findUserByUsername(username)
                .orElseThrow(s);
        return new CustomUserDetails(user); //Wraps the User instance with CustomerUserDetails decorator and returns it
    }
}
