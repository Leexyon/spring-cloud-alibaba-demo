package com.lordy.uaa.web;

import com.lordy.commons.entity.Response;
import com.lordy.uaa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Response currentUser(Principal principal){
        return Response.dataSuccess(principal);
    }
}