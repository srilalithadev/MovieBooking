package com.agi.moviebooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agi.moviebooking.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
