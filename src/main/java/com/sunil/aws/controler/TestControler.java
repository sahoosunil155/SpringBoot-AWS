package com.sunil.aws.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControler {

	
	
	@GetMapping("/")
	public String sayHi() {
		
		return "springboot app deployed  to AWS...";
	}
}
