package com.lab.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lab.model.UserInfoVo;
import com.lab.service.UserService;



@Controller
public class LoginController {

	@Inject
	private UserService userService;
	@RequestMapping("index")
	public String index(){
		List<UserInfoVo> users = userService.listAll(new UserInfoVo());
		for(UserInfoVo u : users){
			System.out.println(u);
		}
		return "index";
	}
	
	@RequestMapping("login")
	public String login(){
		
		return "login";
	}
}
