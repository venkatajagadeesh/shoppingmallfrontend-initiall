package com.jaga.shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

	@RequestMapping(value="Admin")
	public ModelAndView Adminpage() {
	ModelAndView mv= new ModelAndView("/Admin");
	mv.addObject("UserClickedadmin","true");
	return mv;
	}
	
}
