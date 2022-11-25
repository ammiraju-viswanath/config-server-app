package com.interview;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	private static final String HELLO_CONSTANT = "Hello - Constant";


	@GetMapping("/v1/hello")
	public String hello() {
		return "Hello - hardcoded";
	}


	@GetMapping("/v2/hello")
	public String helloConstant() {
		return ConfigController.HELLO_CONSTANT;
	}


	@GetMapping("/v4/hello")
	public String helloProperties(@Value("${hello}")String hello) {
		return hello;
	}

	@GetMapping("/v5/hello")
	public String helloPropertiesDefault(@Value("${helloMsg : defaultvalue -missed }")String hello) {
		return hello;
	}





	@GetMapping("/v3/hello")
	public String helloValueAnnoation(@Value("Hello from @Value")String hello) {
		return hello;
	}

}
