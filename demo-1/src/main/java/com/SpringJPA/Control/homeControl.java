package com.SpringJPA.Control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeControl {

	@RequestMapping("/home")  // GetMapping("/home")
	public String myHome() {
		return "Hii bhavar";
	}
}
