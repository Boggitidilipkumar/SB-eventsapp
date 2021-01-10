package com.eventapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AppuserRepo extends JpaRepository<Users, Integer>{
	
	Users findByUserName(String userName);

}
