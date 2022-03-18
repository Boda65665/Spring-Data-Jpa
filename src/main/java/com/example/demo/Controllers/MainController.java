package com.example.demo.Controllers;

import com.example.demo.DTO.UserDTO;
import com.example.demo.Repositories.UserRepositori;
import com.example.demo.Services.UserServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    UserServiceImplement userServiceImplement;

    @GetMapping("/")
    public String home(){

    System.out.println(userServiceImplement.findAll());
     System.out.println(userServiceImplement.findById((2)));
        return "home";
    }
    @GetMapping("/reg")
    public String he(){
        return "home";
    }

}