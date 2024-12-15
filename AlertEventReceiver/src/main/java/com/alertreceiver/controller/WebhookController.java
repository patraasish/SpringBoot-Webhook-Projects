package com.alertreceiver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alertreceiver.model.Alerts;

@RestController
@RequestMapping("/webhook")
public class WebhookController {
	
	
	Logger logger=LoggerFactory.getLogger(WebhookController.class);
	
	@PostMapping("/recieve")
	public String receiveAlert(@RequestBody Alerts alert) {
		
		logger.info("Received alert payload {}",alert);
		return "Alert received successfully";
		
	}
	
	@GetMapping
	public String test() {
		return "Test Success";
	}

}
