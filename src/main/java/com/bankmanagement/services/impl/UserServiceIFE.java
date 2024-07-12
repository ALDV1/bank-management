package com.bankmanagement.services.impl;

import com.bankmanagement.core.dto.UserDto;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

public interface UserServiceIFE {
    UserDto createUser(UserDto userDto);
    Optional<UserDto> getUserById(Integer id);
    List<UserDto> getAllUser();
    UserDto updateUser(Integer id, UserDto userDto);
    void deleteUser(Principal principal);
    void deleteUserADMIN(Integer id);
}
