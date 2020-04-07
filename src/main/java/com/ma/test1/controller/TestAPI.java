package com.ma.test1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestAPI {
	
	@Value("${environment.a}")
	private String grettings;
	
	@GetMapping("/remote-config")
	public ResponseEntity<String> remoteConfig() {
		String asd = grettings;
		return new ResponseEntity<>(asd, HttpStatus.OK);
	}
	
	
	@GetMapping("/asd")
	public ResponseEntity<String> remoteConfig1() {
		String asd = "asd";
		return new ResponseEntity<>(asd, HttpStatus.OK);
	}
	
}
