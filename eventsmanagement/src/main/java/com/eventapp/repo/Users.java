package com.eventapp.repo;

import java.util.*;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appuser_table")
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String userName;
	private String password;
	
	
	@Column(name="role")
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name="appuser_roles")
	private List<String> roles = new ArrayList<>();
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
	public Users(String userName, String password, List<String> roles) {
		this.userName = userName;
		this.password = password;
		this.roles = roles;
	}
	public Users() {}
	@Override
	public String toString() {
		return "Users [id=" + id + ", userName=" + userName + ", password=" + password + ", roles=" + roles + "]";
	}
	
	
	
	
	
	

}