package com.jadsonspring.course.resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jadsonspring.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping()
    public ResponseEntity<User> FindAll(){
        User u = new User(1L, "Jadson", "888888888", "jadson@email.com", "123456");
        return ResponseEntity.ok().body(u);
    }

}
