package com.biit.controller;

import com.biit.dto.SignupRequest;
import com.biit.entities.User;
import com.biit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.stream.Collectors;

@Controller
public class SignupController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @RequestMapping(value="/signup")
    public String signup()
    {
        return "signup";
    }

    @RequestMapping("/registerUser")
    public String registerUser(SignupRequest signupRequest)
    {
        System.out.println("Signup form submitted");
        System.out.println(signupRequest);
        User user = new User();
        user.setName(signupRequest.getName());
        user.setMailId(signupRequest.getMailId());
        user.setPassword(passwordEncoder.encode(signupRequest.getPassword()));

        String roles = signupRequest.getRoles()
                .stream()
                .collect(Collectors.joining(","));

        user.setRoles(roles);
        userRepository.save(user);
        return "login";
    }
}

