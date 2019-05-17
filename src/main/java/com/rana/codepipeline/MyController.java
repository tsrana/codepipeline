package com.rana.codepipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rana")
public class MyController {
	
	@GetMapping
	public String rana() {
		return "My Name Is TsRANA and it is my 1st codepipeline";
	}
}
