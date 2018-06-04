package com.noxymon.wso2apis.apis;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.noxymon.wso2apis.apis.model.ApiSubscribeRequest;
import com.noxymon.wso2apis.apis.model.ApiSubscribeResponse;
import com.noxymon.wso2apis.apis.model.ApisRetrieveResponse;
import com.noxymon.wso2apis.register.Tokenize;
import com.noxymon.wso2apis.util.Config;
import com.noxymon.wso2apis.util.Constant;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Apis {
    
    public ApisRetrieveResponse retrieve() throws IOException {
	OkHttpClient client = new OkHttpClient();
	ObjectMapper objectMapper = new ObjectMapper();
	Request request = new Request.Builder()
	  .url(Config.host + ":" + Config.port + Constant.Apis.CLIENT_APIS_RETRIEVE_URL)
	  .get()
	  .addHeader("Cache-Control", "no-cache")
	  .build();

	Response response = client.newCall(request).execute();
	return objectMapper.readValue(response.body().string(), ApisRetrieveResponse.class);
    }
    
    public ApiSubscribeResponse subscribe(ApiSubscribeRequest subscribeRequest) throws IOException {
	OkHttpClient client = new OkHttpClient();
	
	ObjectMapper objectMapper = new ObjectMapper();
	Tokenize tokenize = new Tokenize();
	String token = tokenize.getToken(Config.username, Config.password, "password", "apim:subscribe");

	MediaType mediaType = MediaType.parse("application/json");
	RequestBody body = RequestBody.create(mediaType, objectMapper.writeValueAsString(subscribeRequest));
	Request request = new Request.Builder()
	  .url(Config.host + ":" + Config.port + Constant.Apis.CLIENT_APIS_SUBSCRIBE_URL)
	  .post(body)
	  .addHeader("Content-Type", "application/json")
	  .addHeader("Authorization", "Bearer "+token)
	  .addHeader("Cache-Control", "no-cache")
	  .build();

	Response response = client.newCall(request).execute();
	return objectMapper.readValue(response.body().string(), ApiSubscribeResponse.class);
    }
    
}
