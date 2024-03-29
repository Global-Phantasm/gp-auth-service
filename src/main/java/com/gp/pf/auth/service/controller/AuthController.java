package com.gp.pf.auth.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gp.pf.auth.service.AuthService;
import com.gp.pf.auth.service.dto.AuthRequest;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/login")
@RequiredArgsConstructor
public class AuthController {
	final private AuthService loginService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void authorize(@RequestBody AuthRequest loginRequest) {
		loginService.authorize(loginRequest);
	}
	

}
