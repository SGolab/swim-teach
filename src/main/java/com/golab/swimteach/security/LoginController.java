package com.golab.swimteach.security;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping
    public void login(@RequestBody LoginCredentials credentials) {

    }

}
