package com.agi.moviebooking.service;

import java.util.List;

import com.agi.moviebooking.entity.Cart;

public interface IcartService {
	public Cart addToCart(Cart cart);
	
	public List<Cart> getAllByUserCart(long id);
	
	public void deleteCart(long id);
	
	public void updateCart(Cart cart,long cid);

}
