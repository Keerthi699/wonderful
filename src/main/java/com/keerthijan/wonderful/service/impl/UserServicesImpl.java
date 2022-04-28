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
        List<UserDetailsDTO> userDetails = getUserDetails();
        for (int i = 0; i < userDetails.size(); i++) {
            if (userDetails.get(i).getLocation().equals(userDetailsDTO.getLocation())){
                welcome = welcome + userDetails.get(i).getName() + userDetails.get(i).getLocation();
            }
        }
        // if (Country.contains(userDetailsDTO.getLocation())) {
        //    welcome =
        //             " Namaste "
        //                    + userDetailsDTO.getName()
        //                  + ", glad you are in "
        //                  + userDetailsDTO.getCompany();
        //} else {
        //  welcome =
        //          "Hello"
        //                  + userDetailsDTO.getName()
        //                  + ", glad you are in "
        //                  + userDetailsDTO.getCompany()
        //                  + "We don't have your Location";
        //}
        return welcome;
    }

    private List<UserDetailsDTO> getUserDetails() {

        List<UserDetailsDTO> userDetails = new ArrayList<UserDetailsDTO>();
        userDetails.add(0, new UserDetailsDTO(name:  "Keerthi", company: "ArchisAcademy", location: "India"));
        userDetails.add(1, new UserDetailsDTO(name: "Sruthi", company: "Vaichitralaya", location: "France"));
        userDetails.add(2, new UserDetailsDTO(name: "Siva", company: "Medico", location: "U.K" ));
        return userDetails;
    }
}
    //private List<String> getCountryList() {
    //  List<String> countries = new ArrayList<String>();
    //    countries.add("India");
    //    countries.add("U.S");
    //  countries.add("U.K");
    //  return countries;
   // }
   //}
