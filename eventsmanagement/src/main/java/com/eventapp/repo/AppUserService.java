package com.eventapp.repo;
import java.util.*;
public interface AppUserService {
	
	public Users findByUserName(String userName);
	
	public void addUser(Users users);
	
	public List<Users> getAllUsers();

}
