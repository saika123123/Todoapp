package com.todo.app.entity;


import org.springframework.stereotype.Repository;

import lombok.Data;

@Repository
@Data
public class LoginUser {
	
	private int id;
	
	private String userName;
	
	private String password;
	
	private String email;

}