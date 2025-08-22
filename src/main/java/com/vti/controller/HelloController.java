package com.vti.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1")
public class HelloController {
	@GetMapping(value = "/helloworld")
	public String getHello(@RequestParam String name) {
		return "Hello " + name;
	}
}
