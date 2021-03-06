package com.loe.dms.spring.dao;

import java.util.List;

import com.loe.dms.spring.model.entity.UserRoles;
import com.loe.dms.spring.model.entity.Users;

public interface RegistrationDAO {

	public void enrollRegistrationDetails(Users users);

	public Users performUserLogin(Users users);

	public UserRoles emailVerification(String emailId, String verificationCode);
	
	public List<Users> fetchRegisteredUsers();

}
