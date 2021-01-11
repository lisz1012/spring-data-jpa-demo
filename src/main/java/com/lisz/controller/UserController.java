package com.lisz.controller;

import com.lisz.entity.User;
import com.lisz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
	@Autowired
	private UserService service;

	@GetMapping("/users")
	public List<User> findByNameAndAndEmail(@RequestParam("name") String name, @RequestParam("email") String email)  {
		return service.findByNameAndAndEmail(name, email);
	}
}
