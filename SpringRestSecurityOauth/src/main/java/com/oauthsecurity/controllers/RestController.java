package com.oauthsecurity.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oauthsecurity.models.User;
import com.oauthsecurity.services.DataService;

@Controller
@RequestMapping("/api/users")
public class RestController {

	@Autowired
	DataService dataService;

	@RequestMapping(value = "/ab", method = RequestMethod.GET)
	@ResponseBody
	public List<User> list() {
		return dataService.getUserList();

	}
}
