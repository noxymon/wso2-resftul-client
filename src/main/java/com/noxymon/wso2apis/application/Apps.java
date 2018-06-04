package com.noxymon.wso2apis.application;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.noxymon.wso2apis.application.model.ApplicationsResponse;
import com.noxymon.wso2apis.register.Tokenize;
import com.noxymon.wso2apis.util.Config;
import com.noxymon.wso2apis.util.Constant;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Apps {
    public ApplicationsResponse retrieve() throws IOException {
	OkHttpClient client = new OkHttpClient();
	
	Tokenize tokenize = new Tokenize();
	String token = tokenize.getToken(Config.username, Config.password, "password", "apim:subscribe");
	
	Request request = new Request.Builder()
		.url(Config.host + ":" + Config.port + Constant.Apps.CLIENT_APPS_RETRIEVE_URL)
		.get()
		.addHeader("Authorization", "Bearer "+token)
		.addHeader("Cache-Control", "no-cache")
		.build();

	Response response = client.newCall(request).execute();
	ObjectMapper objectMapper = new ObjectMapper();
	return objectMapper.readValue(response.body().string(), ApplicationsResponse.class);
    }
}
