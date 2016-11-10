package com.lab.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.lab.model.UserInfoVo;


public class UserDetailService implements UserDetailsService{

	
	@Override
	public UserDetails loadUserByUsername(String username){
		UserInfoVo user = new UserInfoVo();
		System.out.println(user);
		user.setUsername(username);
		user.setPassword("admin");
		return user;
	}

}
