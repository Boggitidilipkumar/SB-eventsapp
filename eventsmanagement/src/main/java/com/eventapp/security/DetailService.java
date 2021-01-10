package com.eventapp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.eventapp.repo.AppUserService;
import com.eventapp.repo.Users;
@Service
public class DetailService implements UserDetailsService{
	@Autowired
	private AppUserService appUserService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user=appUserService.findByUserName(username);
		System.out.println(user);
		if(user==null)
			throw new UsernameNotFoundException("user with name : "+ username + "is not found");
		String[] roles=new String[user.getRoles().size()];
		user.getRoles().toArray(roles);
		System.out.println(roles);
		
		User u1=new User(user.getUserName(), user.getPassword(), AuthorityUtils.createAuthorityList(roles));
		return u1;
	}

}

