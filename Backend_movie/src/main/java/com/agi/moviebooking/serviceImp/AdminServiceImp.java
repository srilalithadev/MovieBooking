
package com.agi.moviebooking.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agi.moviebooking.dto.AdminDTO;
import com.agi.moviebooking.entity.Admin;
import com.agi.moviebooking.repository.AdminRepository;
import com.agi.moviebooking.service.IAdminService;


@Service
public class AdminServiceImp implements IAdminService {
	
	
	@Autowired
	private AdminRepository repo;


	@Override
	public String addAdmin(AdminDTO adminDto) {
		// TODO Auto-generated method stub
		Admin admin=new Admin();
		admin.setEmail(adminDto.getEmail());
		admin.setPassword(adminDto.getPassword());
			repo.save(admin);
			return "New Admin data saved";
		
	}
	

	@Override
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return repo.findAll();
		
	}

}
