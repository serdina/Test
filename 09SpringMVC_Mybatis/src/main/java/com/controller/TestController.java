package com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.entity.DeptDTO;
import com.service.MyService;

@Controller
public class TestController {

	MyService service;

	public void setService(MyService service) {
		this.service = service;
	}
	
	@RequestMapping("/list")
	public ModelAndView select(){
		List<DeptDTO> list = service.select();
		System.out.println("list.size>"+list.size());
		ModelAndView mav = new ModelAndView();
		mav.addObject("select",list);
		mav.setViewName("list");
		return mav;
	}
	
	@RequestMapping(value="/writeui", method=RequestMethod.POST)
	public String writeui(DeptDTO dto){
		service.write(dto);
		return "redirect:list";
	}
	
	
	

}

