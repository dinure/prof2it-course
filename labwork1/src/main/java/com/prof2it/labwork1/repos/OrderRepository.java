package com.prof2it.labwork1.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prof2it.labwork1.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
