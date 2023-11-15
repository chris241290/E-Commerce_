package com.app.payloads;

import com.app.payloads.DTO.UserDTO;

import lombok.Data;

@Data
public class JWTAuthResponse {
	private String token;
	
	private UserDTO user;
}