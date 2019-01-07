package com.example.micrometer.main;

@RestController
public class HealthController {
	
	@RequestMapping(path = "/health", method = GET)
	public String getHealth() {
		return "Healthy";
	}
}
