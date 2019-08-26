package com.testmanagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

	@RequestMapping({"/menu"})
	public String menuPage() {
		
		return "Menu Page";
		
	}
	
}

