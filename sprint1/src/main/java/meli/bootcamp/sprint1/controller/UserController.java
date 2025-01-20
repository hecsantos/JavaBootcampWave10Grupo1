package meli.bootcamp.sprint1.controller;

import meli.bootcamp.sprint1.service.IUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

    IUserService userService;

    @GetMapping("/users")
    public ResponseEntity<?> getUsers(){
        return new ResponseEntity(userService.getUsers(), HttpStatus.OK);
    }

}
