package com.brotherGivenTask.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {
	
	@RequestMapping(value= {"/yourTask"},method=RequestMethod.GET)
	public SiteAddress methodResponse()
	{
		List<Employee> ls=new ArrayList<>();
		Employee emp1=new Employee(1,"sagar","sagarvaranasi202@gmail.com");
		Employee emp2=new Employee(2,"teja","teja.varanasi735@gmail.com");
		ls.add(emp1);
		ls.add(emp2);
		CompanyDetails cmd=new CompanyDetails();
		cmd.setSiteAddress("Hyderabad");
		cmd.setUserInfo(ls);
		SiteAddress sd=new SiteAddress();
		sd.setSite1(cmd);
		return sd;
		
	}

}
