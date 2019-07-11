package com.lti.training.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.training.entity.User;

//@Component
@Repository
public class RegisterDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public int save(User user) {
		User u=entityManager.merge(user);
		return u.getId();
	}                                                               
	
	public User fetchOne(String em){
		
		Query q = entityManager.createQuery("select u from User as u where u.email=:em");
		q.setParameter("em", em);
		return (User)q.getSingleResult();
		
		
	}
	
	
	
	

}
