package edu.mum.extra.service;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.extra.dao.UserRepository;
import edu.mum.extra.entity.User;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository userDao;
	
	public User login(User user) {
		User findOne = userDao.findOne(user.getUserId());
		if (findOne != null && findOne.getPassword().equals(user.getPassword())) {
			Hibernate.initialize(findOne.getRoles());
			return findOne;
		}
		return null;
	}
	
	public void saveUser(User user) {
		userDao.save(user);
	}
	
	public User get(int id) {
		User user = userDao.findOne(id);
		Hibernate.initialize(user.getServices());
		return user;
	}
}
