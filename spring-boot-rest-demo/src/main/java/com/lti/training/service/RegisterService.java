package com.lti.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.training.dao.RegisterDao;
import com.lti.training.dto.StatusDTO;
import com.lti.training.dto.UserDTO;
import com.lti.training.entity.User;

//@Component
@Service	//annotation provided by spring ...@Component
public class RegisterService {
	
	@Autowired
	private RegisterDao registerDao;
	
	@Transactional
	public StatusDTO register(UserDTO userDTO){
		//copying data from user to entity
		User user=new User();
		user.setName(userDTO.getName());
		user.setAge(userDTO.getAge());
		user.setEmail(userDTO.getEmail());
		
		int id=registerDao.save(user);
		
		StatusDTO status=new StatusDTO();
		status.setId(id);
		status.setMessage("Up and running");
		
		//List<User> list = registerDao.fetchOne(user.getEmail());
		
		return status;
	}
	
		public User showSearch(String email){
			
			User u = new User();
			return registerDao.fetchOne(email);
			
			
		}
		

}
