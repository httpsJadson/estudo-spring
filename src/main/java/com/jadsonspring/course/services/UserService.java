package com.jadsonspring.course.services;

import com.jadsonspring.course.entities.User;
import com.jadsonspring.course.reporistories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User create(User user){
        return repository.save(user);
    }

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);

        return obj.get();

    }

    public User update(Long id, User newUser) {
        User user = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if(newUser.getName() != null){
            user.setName(newUser.getName());
        }

        if(newUser.getEmail() != null){
            user.setEmail(newUser.getEmail());
        }

        if(newUser.getPhone() != null){
            user.setPhone(newUser.getPhone());
        }

        return repository.save(user);
    }

    public  void delete(Long id){
        repository.deleteById(id);
    }
}
