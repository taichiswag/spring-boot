package com.biit.controller;

import java.util.Collection;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping({"/", "/dashboard"})
    public String home()
    {
        Authentication auth=SecurityContextHolder.getContext().getAuthentication();
        System.out.println("Following user is accessing the application:");
        System.out.println("UserId: "+auth.getName());

        Collection<?> c = auth.getAuthorities();
        System.out.println(c);
        return "dashboard";
    }

    @PreAuthorize("hasRole('TX_MANAGER')")
    @RequestMapping(value="/tx")
    public String txManage()
    {
        return "tx";
    }

    @RequestMapping(value="/about")
    public String about()
    {
        return "about";
    }
    @RequestMapping(value="/contact")
    public String contact()
    {
        return "contact";
    }
    @RequestMapping(value="/login")
    public String login()
    {
        return "login";
    }

}
