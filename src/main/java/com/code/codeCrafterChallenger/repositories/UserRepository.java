package com.code.codeCrafterChallenger.repositories;

import com.code.codeCrafterChallenger.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , String> {
}
