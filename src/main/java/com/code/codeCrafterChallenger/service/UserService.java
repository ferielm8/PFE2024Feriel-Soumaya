package com.code.codeCrafterChallenger.service;

import com.code.codeCrafterChallenger.entities.Role;
import com.code.codeCrafterChallenger.entities.User;

import java.util.OptionalLong;

public interface UserService {
    User AddNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);

    void addRoleToUser(String username , String roleName);
}
