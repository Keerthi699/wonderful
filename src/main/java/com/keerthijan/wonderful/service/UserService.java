package com.keerthijan.wonderful.service;

import com.keerthijan.wonderful.dto.UserDetailsDTO;

public interface UserService {
    String getWelcomeMessage(UserDetailsDTO userDetailsDTO);
}
