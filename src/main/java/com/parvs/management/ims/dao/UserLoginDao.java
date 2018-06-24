package com.parvs.management.ims.dao;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.parvs.management.ims.impl.DaoFactory;
import com.parvs.management.ims.model.User;

@Repository
public class UserLoginDao  {

@Autowired	
private DaoFactory daoFactory;

@PersistenceContext
EntityManager entityManager;

public String authenticateUser(User p_user)
{
	
     //query.setParameter(1, firstName + "%");
	
	return null;
}

}
