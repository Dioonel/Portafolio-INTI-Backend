package com.portafolio.backend.portafolio.controllers;

import com.portafolio.backend.portafolio.components.JWTUtil;
import com.portafolio.backend.portafolio.dto.AuthenticationRequest;
import com.portafolio.backend.portafolio.dto.AuthenticationResponse;
import com.portafolio.backend.portafolio.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private UserService userService;

    @Autowired
    private JWTUtil jwtUtil;

    @PostMapping("/authenticate")
    public AuthenticationResponse createToken(@RequestBody AuthenticationRequest request){
        try{
            authManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));

            UserDetails userDetails = userService.loadUserByUsername(request.getUsername());
            String jwt = jwtUtil.generateToken(userDetails);

            return new AuthenticationResponse(jwt);
        } catch (BadCredentialsException err) {
            System.out.println(err);
            return null;
        }
    }

//    @PostMapping("/verify")
//    public boolean verifyToken(@RequestBody String token){
//        if(!jwtUtil.isTokenExpired(token)){
//            return true;
//        }
//        return false;
//    }
}
