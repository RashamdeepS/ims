package com.parvs.management.ims.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.parvs.management.ims.dao.UserLoginDao;
import com.parvs.management.ims.model.User;
@Service
public class UserLoginService {
	@Autowired
	public UserLoginDao userLoginDao;
	
	public String authenticateUser(User p_user)
	{
		String l_user;
		l_user = userLoginDao.authenticateUser(p_user);
		return l_user;
		
	}

}
