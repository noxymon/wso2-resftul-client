package com.noxymon.wso2apis.register;

import java.io.IOException;
import java.util.Base64;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.noxymon.wso2apis.register.model.RegisterPayload;
import com.noxymon.wso2apis.register.model.RegisterResponse;
import com.noxymon.wso2apis.util.Config;
import com.noxymon.wso2apis.util.Constant;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Register {

    public RegisterResponse clientRegister(RegisterPayload payload) throws IOException {
	OkHttpClient client = new OkHttpClient();
	MediaType mediaType = MediaType.parse("application/json");
	ObjectMapper objectMapper = new ObjectMapper();
	RequestBody body = RequestBody.create(mediaType, objectMapper.writeValueAsString(payload));
	Request request = new Request.Builder().url(Config.host + ":" + Config.port + Constant.Register.CLIENT_REGISTER_URL)
		.post(body).addHeader("Authorization", "Basic " + Base64.getEncoder().encodeToString((Config.username + ":" + Config.password).getBytes()))
		.addHeader("Content-Type", "application/json")
		.addHeader("Cache-Control", "no-cache")
		.build();

	Response response = client.newCall(request).execute();
	return objectMapper.readValue(response.body().string(), RegisterResponse.class);
    }

}
