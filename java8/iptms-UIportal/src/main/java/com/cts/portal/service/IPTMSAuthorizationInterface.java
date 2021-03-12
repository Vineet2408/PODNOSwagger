package com.cts.portal.service;

import com.cts.portal.model.AuthResponse;
import com.cts.portal.model.JwtToken;
import com.cts.portal.model.UserData;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IPTMSAuthorizationInterface {


	@POST("/loginuser")
	public Call<UserData> login(@Body UserData userlogincredentials);

	@POST("/validate")
	public Call<AuthResponse> getValidity(@Body JwtToken jwtToken);

	
}
