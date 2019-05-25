package com.luv2code.springdemo;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Component;
// import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;


@Controller
public class Homecontroller
{
	
	    @RequestMapping("/")
		public String checkone()
		{
			//return "first";
	    	return "Index_page";
		}
	    
	    
	    @RequestMapping("/helloworld")
	    public String checktwo()
	    {
	    	return "Hello-world";
	    }
	    
	    @RequestMapping("/Submission")
	    public String checkthree()
	    {
	    	return "Submission";
	    }
	    
	    @RequestMapping("/Freemarker")
	    public String checkvlc(Model mdt)
	    {
	    	mdt.addAttribute("abc","WORLD");
	    	return "hello";
	    }
	    
	   
	    
	    
}

