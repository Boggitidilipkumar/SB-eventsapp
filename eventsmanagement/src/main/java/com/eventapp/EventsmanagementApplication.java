package com.eventapp;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import com.eventapp.entities.Events;
import com.eventapp.repo.AppUserService;
import com.eventapp.repo.Users;
import com.eventapp.service.EventService;

@SpringBootApplication
@Component
public class EventsmanagementApplication implements CommandLineRunner {
	@Autowired
	private EventService eventService;
	@Autowired
	private AppUserService appUserService;

	public static void main(String[] args) {
		SpringApplication.run(EventsmanagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*Events e1 = new Events("circket", "hcl stadium", 1500.00, new Date(), 11.00, 11);
		Events e2 = new Events("drawing", "hcl drawing room", 100.00, new Date(), 5.00, 5);
		Events e3 = new Events("dancing", "hcl auditourim", 2000.00, new Date(), 15.00, 10);
		Events e4 = new Events("yoga", "hcl yoga room", 500.00, new Date(), 4.00, 30);
		Events e5 = new Events("singing", "hcl auditourim", 300.00, new Date(), 14.00, 50);

		eventService.addEvents(e1);
		eventService.addEvents(e2);
		eventService.addEvents(e3);
		eventService.addEvents(e4);
		eventService.addEvents(e5);*/
		
		//creating users for login
		
		/*Users u1=new Users("dilip", "dilip123", Arrays.asList("ROLE_ADMIN","ROLE_EMP"));
		Users u2=new Users("balu", "balu123", Arrays.asList("ROLE_EMP"));
		
		appUserService.addUser(u1);
		appUserService.addUser(u2);*/

		
		/*List<Users> users=appUserService.getAllUsers();
		users.forEach(user->System.out.println(user));*/
		
		

	}

}
