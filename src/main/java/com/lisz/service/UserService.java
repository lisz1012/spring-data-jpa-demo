package com.lisz.service;

import com.lisz.dao.UserDao;
import com.lisz.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
	@Autowired
	private UserDao dao;

	public List<User> findByNameAndAndEmail(String name, String email) {
		return dao.findByNameAndAndEmail(name, email);
	}
}
