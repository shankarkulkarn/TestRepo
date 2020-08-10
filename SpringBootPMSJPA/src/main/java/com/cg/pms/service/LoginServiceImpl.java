package com.cg.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.pms.dao.LoginDao;
import com.cg.pms.entity.Login;
import com.cg.pms.exception.LoginException;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDao;
	
	@Override
	public String validate(String userName, String userPass) throws LoginException {
		
		Login login =loginDao.validate(userName, userPass);
		if(login == null)
		{
			throw new LoginException(" Login Failed ");
		}
		return login.getUserRole();
	}

	@Override
	public Login create(Login login) throws LoginException {
		
		Login user = loginDao.findUser(login.getUserName());
		
		if(user != null)
		{
			throw new LoginException("USER ALREADY EXIST");
		}
		else
		{
			user = loginDao.create(login);
		}
		return user;
	}

}
