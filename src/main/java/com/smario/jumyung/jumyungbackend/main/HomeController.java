package com.smario.jumyung.jumyungbackend.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class HomeController {
	
	@GetMapping("/main")
	public String main() {
		String A = "";
		
		System.out.println("test");
		
		return A;
	}

}
