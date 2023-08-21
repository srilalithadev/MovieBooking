package com.agi.moviebooking.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agi.moviebooking.entity.Cart;
import com.agi.moviebooking.repository.CartRepository;
import com.agi.moviebooking.service.IcartService;



@Service
public class CartServiceImp implements IcartService {
	
	@Autowired
	private CartRepository repo;
	



	@Override
	public Cart addToCart(Cart cart) {
		return repo.save(cart);
	}



	@Override
	public List<Cart> getAllByUserCart(long id) {
		return repo.findAllByUserId(id);
		
	}


	@Override
	public void deleteCart(long id) {
		

		repo.deleteById(id);

	}
	

	

	@Override
	public void updateCart(Cart cart, long cid) {
		// TODO Auto-generated method stub
		Cart updated=repo.findById(cid).get();
		updated=cart;
		repo.save(updated);
		
	}

}
