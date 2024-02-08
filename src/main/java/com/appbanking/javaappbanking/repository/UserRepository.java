package com.appbanking.javaappbanking.repository;

import com.appbanking.javaappbanking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    Boolean existsByEmail(String email);

}
