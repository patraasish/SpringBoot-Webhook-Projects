package com.alertgenerate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alertgenerate.model.Alerts;

@RestController
@RequestMapping("/alerts")
public class AlertController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${webhook.url}")
	private String webhookUrl;
	
	@PostMapping("/trigger")
	public ResponseEntity<String> triggerAlert(@RequestBody Alerts alerts ){
		
		try {
			ResponseEntity<String> response=restTemplate.postForEntity(webhookUrl, alerts, String.class);
			return ResponseEntity.ok("Alert sent to webhook! Response: " + response.getBody());
		}
		catch(Exception e){
			 return ResponseEntity.status(500).body("Failed to send alert to webhook: " + e.getMessage());
		}
	}

}
