package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.LoginBean;

@Service

public class LoginService {
	
	@Autowired
	public boolean validate(LoginBean bean)	{
		if(bean.getUserName().equals(bean.getPassword())) {
			return true;
		}else {
		return false;
	}
	}

}
