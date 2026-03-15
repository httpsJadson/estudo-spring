package com.jadsonspring.course.services;

import com.jadsonspring.course.entities.Order;
import com.jadsonspring.course.reporistories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public Order create(Order order){
        return repository.save(order);
    }

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);

        return obj.get();

    }

    /*
     public Order update(Long id, Order newOrder) {
         Order order = repository.findById(id)
                 .orElseThrow(() -> new RuntimeException("Order not found"));

         if(newOrder.getName() != null){
             order.setName(newOrder.getName());
         }

         if(newOrder.getEmail() != null){
             order.setEmail(newOrder.getEmail());
         }

         if(newOrder.getPhone() != null){
             order.setPhone(newOrder.getPhone());
         }

         return repository.save(order);
     }
    */

    public  void delete(Long id){
        repository.deleteById(id);
    }
}
