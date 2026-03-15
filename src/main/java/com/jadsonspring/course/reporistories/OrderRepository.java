package com.jadsonspring.course.reporistories;

import com.jadsonspring.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {


}
