package com.example.RestServiceWithInDS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class URLController {
	
	
	@GetMapping("/storeurl")
	public String storeURL(@RequestParam(value="url",defaultValue=" ") String url) {
		return URLService.storeUrl(url);
	}
	
	@GetMapping("/geturl")
	public String getKey(@RequestParam(value="url",defaultValue=" ") String url) {
		return URLService.getUrlKey(url);
	}
}
