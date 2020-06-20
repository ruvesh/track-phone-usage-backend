package com.ruv.phoneusagemonitor.controller;


import com.ruv.phoneusagemonitor.model.AuthToken;
import com.ruv.phoneusagemonitor.model.UserDetails;
import com.ruv.phoneusagemonitor.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class LoginController {

    @Autowired
    UserRepo ur;

    @Autowired
    Optional<UserDetails> userDetails;

    @Autowired
    AuthToken authToken;

    @PostMapping("/login")
    public AuthToken login(@RequestBody UserDetails requesterUser){

        userDetails = ur.findById(requesterUser.getUsername());

        if(userDetails.isPresent()){
            authToken.setUsername(userDetails.get().getUsername());
            if(userDetails.get().fetchPass().equals(requesterUser.fetchPass())){
                authToken.setAuthMessage("Access Granted");
            }
            else {
                authToken.setAuthMessage("Access Denied");
            }
        }
        else{
            authToken.setUsername(requesterUser.getUsername());
            authToken.setAuthMessage("No such user found, Please register");
        }
        
        return authToken;
    }

}
