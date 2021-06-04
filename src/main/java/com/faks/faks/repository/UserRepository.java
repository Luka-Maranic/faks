package com.faks.faks.repository;

import com.faks.faks.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByEmailLike(String email);

    List<User> findByfullNameLike(String fullName);

}

