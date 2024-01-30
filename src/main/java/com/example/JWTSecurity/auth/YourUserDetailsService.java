package com.example.JWTSecurity.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class YourUserDetailsService implements UserDetailsService {

    // Implement the loadUserByUsername method to load user details from your data source
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Implement the logic to load user details (e.g., from a database)
        // ...

        // Example: return a UserDetails object
        // return new User(username, password, authorities);
        return null;
    }
}