package com.noxymon.wso2apis.register;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Base64;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.noxymon.wso2apis.register.model.RegisterPayload;
import com.noxymon.wso2apis.register.model.RegisterResponse;
import com.noxymon.wso2apis.register.model.TokenResponse;
import com.noxymon.wso2apis.util.Config;
import com.noxymon.wso2apis.util.Constant;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.Util;

public class Tokenize {
		
	public String getToken(String username, String password, String grantType, String scope) throws IOException {
		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
		RequestBody body = RequestBody.create(mediaType, "grant_type="+grantType+"&username="+Config.username+"&password="+Config.password+"&scope="+URLEncoder.encode(scope, Util.UTF_8.name()));
		
		RegisterPayload registerPayload = new RegisterPayload();
		registerPayload.setCallbackUrl(Config.callBackURL);
		registerPayload.setClientName(Config.applicationName);
		registerPayload.setGrantType(grantType);
		registerPayload.setSaasApp(true);
		registerPayload.setOwner("admin");
		
		Register register = new Register();
		RegisterResponse registerResponse = new RegisterResponse();
		registerResponse = register.clientRegister(registerPayload);
		
		Request request = new Request.Builder()
		  .url(Config.host + ":" + Config.portToken + Constant.Register.CLIENT_REGISTER_TOKEN)
		  .post(body)
		  .addHeader("Authorization", "Basic " + Base64.getEncoder().encodeToString((registerResponse.getClientId() + ":" + registerResponse.getClientSecret()).getBytes()))
		  .addHeader("Cache-Control", "no-cache")
		  .addHeader("Content-Type", "application/x-www-form-urlencoded")
		  .build();
		
		ObjectMapper objectMapper = new ObjectMapper();
		Response response = client.newCall(request).execute();
		return objectMapper.readValue(response.body().string(), TokenResponse.class).getAccessToken();
	}
	
}
