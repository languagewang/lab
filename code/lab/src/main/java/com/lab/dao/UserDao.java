package com.lab.dao;

import com.lab.model.UserInfoVo;



public interface UserDao {
	
	public int countAll(UserInfoVo user);
	
	public int insert(UserInfoVo user);
	
}
