package com.example.LT_Nhom9_Java_Buoi7.services;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        String pass;
        Set<GrantedAuthority> authorities = new HashSet<>();
        if(username == "admin") {
            pass = "admin";
            authorities.add(new SimpleGrantedAuthority("ADMIN"));
        }
        else if(username == "sales") {
            pass = "sales";
            authorities.add(new SimpleGrantedAuthority("SALES"));
        }
        else {
            pass ="user";
            authorities.add(new SimpleGrantedAuthority("USER"));
        }
        return new org.springframework.security.core.userdetails.User(
                username,
                new BCryptPasswordEncoder().encode(pass),
                authorities
        );
    }
}

