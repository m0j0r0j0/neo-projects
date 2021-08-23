package com.neoprojects.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {

	 @Value("${first.batch.time}")
	 private String firstBatch;
	 
	 @Value("${second.batch.time}")
	 private String secondBatch;
	 
	 @Value("${third.batch.time}")
	 private String thirdBatch;
	 
	 
	 @Value("${first.batch.name}")
	 private String firstBatchName;
	 
	 @Value("${second.batch.name}")
	 private String secondBatchName;
	 
	 @Value("${third.batch.name}")
	 private String thirdBatchName;
	 
	 @Value("${training.mobile}")
	 private String mobile;
	 
	 @Value("${training.address}")
	 private String address;
	 
	 
	 @Value("${course.plan.1}")
	 private String plan1;
	 @Value("${course.plan.1.price}")
	 private String plan1Price;
	 
	 @Value("${course.plan.2}")
	 private String plan2;
	 @Value("${course.plan.2.price}")
	 private String plan2Price;
	 
	 @Value("${course.plan.3}")
	 private String plan3;
	 @Value("${course.plan.3.price}")
	 private String plan3Price;
	 
	 @Value("${course.price.description}")
	 private String coursePriceDesc;
	 
	
	@GetMapping(value = {"/","index"})
	public String index2( String isCountEnable, Model m, HttpServletRequest request){
		
		m.addAttribute("firstBatch", firstBatch);
		m.addAttribute("secondBatch", secondBatch);
		m.addAttribute("thirdBatch", thirdBatch);
		m.addAttribute("firstBatchName", firstBatchName);
		m.addAttribute("secondBatchName", secondBatchName);
		m.addAttribute("thirdBatchName", thirdBatchName);
		m.addAttribute("address", address);
		m.addAttribute("mobile", mobile);
		
		m.addAttribute("plan1", plan1);
		m.addAttribute("plan2", plan2);
		m.addAttribute("plan3", plan3);
		m.addAttribute("plan1Price", plan1Price);
		m.addAttribute("plan2Price", plan2Price);
		m.addAttribute("plan3Price", plan3Price);
		m.addAttribute("coursePriceDesc", coursePriceDesc);
		
		return "dashboard";
	}
}
