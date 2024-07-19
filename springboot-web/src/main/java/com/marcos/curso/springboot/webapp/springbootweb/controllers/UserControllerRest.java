package com.marcos.curso.springboot.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.curso.springboot.webapp.springbootweb.Models.User;
import com.marcos.curso.springboot.webapp.springbootweb.Models.dto.UserDto;



@RestController
@RequestMapping("/api")
public class UserControllerRest{

    

    @GetMapping("/details")
    public UserDto details(){

        UserDto userDto = new UserDto();
        User user = new User("Marcos" , "Bautista");
        userDto.setUser(user);
        userDto.setTitle("Hola mundo SPRING BOOT");
       
        return userDto;
    }

    //TODO regresar un listado de forma facil
    @GetMapping("/list")    
    public List<User> list(){
        User user = new User("Marcos" , "Bautista");
        User user2 = new User("Santiago" , "Gaytan");
        User user3 = new User("Nicolas" , "Arellano");

        List<User> users = Arrays.asList(user,user2,user3);

        return users;
        
    }

    @GetMapping("/details-map")
    public Map<String,Object> detailsMap(){

        User usr = new User("Nicolas", "Arellano");

       Map<String,Object> body = new HashMap<>();

       body.put("title", "H");
       body.put("user", usr);
       
        return body;
    }

}
