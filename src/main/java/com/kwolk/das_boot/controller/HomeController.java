package com.kwolk.das_boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String home()
	{
		return "Das Boot, reporting for duty!";
	}

	@RequestMapping("/test")
	public String test()
	{
		return "Test page";
	}

}
