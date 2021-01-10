package com.eventapp.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AppUserServiceImpl implements AppUserService{
	@Autowired
	private AppuserRepo appUserRepo;

	@Override
	public Users findByUserName(String userName) {
		return appUserRepo.findByUserName(userName);
	}

	@Override
	public void addUser(Users users) {
		appUserRepo.save(users);
		
	}

	@Override
	public List<Users> getAllUsers() {
		return appUserRepo.findAll();
	}

}
