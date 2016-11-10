package com.lab.service;

import java.util.List;

import com.lab.model.UserInfoVo;


public interface UserService {
	public List<UserInfoVo> listAll(UserInfoVo user);
	
	public int insert(UserInfoVo user);
}
