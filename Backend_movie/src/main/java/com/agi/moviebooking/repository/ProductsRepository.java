package com.agi.moviebooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agi.moviebooking.entity.Products;


@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

}
