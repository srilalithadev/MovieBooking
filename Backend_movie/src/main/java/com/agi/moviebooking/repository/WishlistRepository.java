package com.agi.moviebooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agi.moviebooking.entity.Wishlist;


public interface WishlistRepository extends JpaRepository<Wishlist, Long> {

}
