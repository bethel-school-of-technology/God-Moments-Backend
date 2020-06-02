package com.godmomentsbackend.auth;

public class AuthConstants {

	public static final String SECRET = "SuperSecretKey";
	public static final long EXPIRATION_TIME = 432_000_000; 
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";
	public static final String SIGN_UP_URL = "/api/user/register";
}
