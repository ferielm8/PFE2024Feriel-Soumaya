package com.code.codeCrafterChallenger.repositories;

import com.code.codeCrafterChallenger.entities.Role;
import com.code.codeCrafterChallenger.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
