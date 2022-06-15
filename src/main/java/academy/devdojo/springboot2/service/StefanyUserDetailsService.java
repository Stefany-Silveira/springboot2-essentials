package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.repository.StefanyUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StefanyUserDetailsService implements UserDetailsService {
    private final StefanyUserRepository stefanyUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username){
        return Optional.ofNullable(stefanyUserRepository.findByUsername(username))
                .orElseThrow(() -> new UsernameNotFoundException("DevDojo User not found"));
    }
}
