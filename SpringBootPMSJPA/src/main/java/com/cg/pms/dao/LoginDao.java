package com.cg.pms.dao;

import com.cg.pms.entity.Login;
import com.cg.pms.exception.LoginException;

public interface LoginDao {

public Login validate(String userName,String userPass) throws LoginException ;
}
