package com.keerthijan.wonderful.controller;

import com.keerthijan.wonderful.dto.UserDetailsDTO;
import com.keerthijan.wonderful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired private UserService userService;

    @PostMapping(value = "/userDetails")
    public String userDetails(@RequestBody UserDetailsDTO userDetailsDTO) {
        return userService.getWelcomeMessage(userDetailsDTO);
    }
}
