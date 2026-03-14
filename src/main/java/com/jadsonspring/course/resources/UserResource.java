package com.jadsonspring.course.resources;
import com.jadsonspring.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping()
    public ResponseEntity<User> FindAll(){
        User u = new User(1, "Jadson", "888888888", "jadson@email.com", "123456");
        return ResponseEntity.ok().body(u);
    }

}
