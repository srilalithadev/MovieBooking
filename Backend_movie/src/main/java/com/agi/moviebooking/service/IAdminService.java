package com.agi.moviebooking.service;

import java.util.List;

import com.agi.moviebooking.dto.AdminDTO;
import com.agi.moviebooking.entity.Admin;

public interface IAdminService {
	
	public String addAdmin(AdminDTO adminDto);
	
	public List<Admin> getAllAdmin();

}
