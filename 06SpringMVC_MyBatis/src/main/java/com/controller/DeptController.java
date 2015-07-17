package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.DeptDTO;
import com.service.DeptService;

@Controller
public class DeptController {

	DeptService service;
	String aaa;
	String aaa2;

	@Autowired
	public void setService(DeptService service) {
		this.service = service;
	}
	
	@RequestMapping("/list")
	@ModelAttribute("list")
	public ArrayList<DeptDTO> xxx(){
		
		return  service.select();
	}
	
	
}
