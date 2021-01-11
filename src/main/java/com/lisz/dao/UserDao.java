package com.lisz.dao;

import com.lisz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	List<User> findByNameAndAndEmail(String name, String email);
}
