package com.JP.ias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/say")
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public String hellorWorld(){
		
		return "helloworld";
	}

}
