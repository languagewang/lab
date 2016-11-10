package com.lab.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.dao.CommonDao;
import com.lab.model.UserInfoVo;
import com.lab.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private CommonDao dao;
	
	

	public List<UserInfoVo> listAll(UserInfoVo user) {
		List<UserInfoVo> users = dao.selectList("com.lab.dao.userMapper.selectAll", user);
		return users;
	}

	public int insert(UserInfoVo user) {
		int i = dao.insert("com.lab.dao.userMapper.insert", user);
		return i;
	}


}
