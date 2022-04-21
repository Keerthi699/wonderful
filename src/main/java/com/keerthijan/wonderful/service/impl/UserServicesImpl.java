package com.keerthijan.wonderful.service.impl;

import com.keerthijan.wonderful.dto.UserDetailsDTO;
import com.keerthijan.wonderful.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserService {

    String INDIA = "India";

    @Override
    public String getWelcomeMessage(UserDetailsDTO userDetailsDTO) {
        String welcome = "";
        if (INDIA.equals(userDetailsDTO.getLocation())) {
            welcome =
                    " Namaste "
                            + userDetailsDTO.getName()
                            + ", glad you are in "
                            + userDetailsDTO.getCompany();
        } else {
            welcome =
                    "Hello"
                            + userDetailsDTO.getName()
                            + ", glad you are in "
                            + userDetailsDTO.getCompany();
        }
        return welcome;
    }
}
