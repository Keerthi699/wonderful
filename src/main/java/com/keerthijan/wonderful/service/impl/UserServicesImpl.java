package com.keerthijan.wonderful.service.impl;

import com.keerthijan.wonderful.dto.UserDetailsDTO;
import com.keerthijan.wonderful.service.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserService {

    public static final String INDIA = "India";

    @Override
    public String getWelcomeMessage(UserDetailsDTO userDetailsDTO) {
        String welcome = "";
        List<String> Country = getCountryList();
        if (Country.contains(userDetailsDTO.getLocation())) {
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
                            + userDetailsDTO.getCompany()
                            + "We don't have your Location";
        }
        return welcome;
    }

    private List<String> getCountryList() {
        List<String> countries = new ArrayList<String>();
        countries.add("India");
        countries.add("U.S");
        countries.add("U.K");
        return countries;
    }
}
