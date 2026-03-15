package com.jadsonspring.course.resources;

import com.jadsonspring.course.entities.Order;
import com.jadsonspring.course.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService service;

    @PostMapping()
    public Order create(@RequestBody Order order){
        return service.create(order);
    }

    @GetMapping()
    public ResponseEntity<List<Order>> FindAll(){
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> FindById(@PathVariable Long id){
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    // @PatchMapping("/{id}")
    // public Order update(@PathVariable Long id, @RequestBody Order order){
    //     return service.update(id, order);
    // }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
