package com.prof2it.labwork1.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prof2it.labwork1.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
