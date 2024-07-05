package com.marcos.curso.springboot.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.curso.springboot.webapp.springbootweb.Models.User;


@RestController
@RequestMapping("/api")
public class UserControllerRest{

    @GetMapping("/detailsrest")
    public Map<String,Object> details(){

        User usr = new User("Nicolas", "Arellano");

       Map<String,Object> body = new HashMap<>();

       body.put("title", "Hola");
       body.put("user", usr);
       
        return body;
    }

}
