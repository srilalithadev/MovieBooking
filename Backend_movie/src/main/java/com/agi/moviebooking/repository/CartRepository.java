package com.agi.moviebooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.agi.moviebooking.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
	
	List<Cart> findAllByUserId(Long id);
}