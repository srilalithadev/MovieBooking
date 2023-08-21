package com.agi.moviebooking.service;

import java.util.List;

import com.agi.moviebooking.dto.UserDTO;
import com.agi.moviebooking.entity.User;

public interface IUserService {
	
	public String addUser(UserDTO userDto);
	
	public List<User> getAllUser();
	
	public String updateUser(UserDTO userDto);
	
	public User getUserById(long id);
	
	public String deleteUser(long id);

}
