package com.gp.pf.auth.service;

import org.springframework.stereotype.Service;

import com.gp.pf.auth.service.dto.AuthRequest;
import com.gp.pf.auth.service.model.Auth;
import com.gp.pf.auth.service.repository.AuthRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthService {
	final private AuthRepository authRepository;

	public void authorize(AuthRequest authRequest) {		
		Auth login = Auth.builder()
				.username(authRequest.getUsername())
				.password(authRequest.getPassword())
				.time(authRequest.getTime())
				.device(authRequest.getDevice())
				.build();
		authRepository.save(login);
		log.info("Login id: {} initiated",login.getId());
	}
}
