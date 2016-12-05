package com.crunchify.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Crunchify.com
 * 
 */
 
@Controller
public class CrunchifyHelloWorld {
 
	@RequestMapping(value = "/welcome",method = RequestMethod.GET)
	public ModelAndView helloWorld() {
 
		/*String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";*/
		
		return new ModelAndView("welcome", "command", new Student());
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute("student")Student student, 
	   ModelMap model) {
	      model.addAttribute("name", student.getName());
	     
	      
	      return "result";
	}
}