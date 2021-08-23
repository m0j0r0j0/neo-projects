package com.neoprojects.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {

	
	@GetMapping(value = {"/","index"})
	public String index2( String isCountEnable, Model m, HttpServletRequest request){
		return "dashboard";
	}
}
