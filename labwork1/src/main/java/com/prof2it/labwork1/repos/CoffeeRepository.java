package com.prof2it.labwork1.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prof2it.labwork1.model.Coffee;

@Repository
public interface CoffeeRepository extends JpaRepository<Coffee, Long> {

}
