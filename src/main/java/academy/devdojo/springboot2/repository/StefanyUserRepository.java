package academy.devdojo.springboot2.repository;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.domain.StefanyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StefanyUserRepository extends JpaRepository<StefanyUser, Long> {

  StefanyUser findByUsername(String username);

}