package com.agi.moviebooking.service;

import java.util.List;

import com.agi.moviebooking.dto.WishlistDTO;
import com.agi.moviebooking.entity.Wishlist;


public interface IWishlistService {
	
	public Wishlist addToWishList(WishlistDTO dto);
	
	public List<Wishlist> getAllwishlist();
	
	public List<Wishlist> getAllDataWithSameUserId(long uid);
	
	public String deleteByUserIdAndProdId(long uid,long pid);
		
	}


