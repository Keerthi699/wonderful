package com.keerthijan.wonderful.controller;

import com.keerthijan.wonderful.dto.UserDetailsDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping(value = "/userDetails")
    public String getUserDetails(@RequestBody UserDetailsDTO userDetailsDTO) {
        return " My name is "
                + userDetailsDTO.getName()
                + ". I am from "
                + userDetailsDTO.getLocation()
                + ". I work at "
                + userDetailsDTO.getCompany();
    }
}
