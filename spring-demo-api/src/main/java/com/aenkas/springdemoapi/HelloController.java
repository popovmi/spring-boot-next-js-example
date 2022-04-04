package com.aenkas.springdemoapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "a")
	public String a() {
		return "it's a";
	}

	@GetMapping(value = "b")
	public String b() {
		return "it's b";
	}

	@GetMapping(value = "ab")
	public String ab() {
		return "it's ab";
	}

}
