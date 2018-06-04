package com.noxymon.wso2apis.register.model;

public class RegisterResponse {

	private String clientId;
	private String clientName;
	private String callBackURL;
	private String clientSecret;
	private Boolean isSaasApplication;
	private Object appOwner;
	private String jsonString;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getCallBackURL() {
		return callBackURL;
	}

	public void setCallBackURL(String callBackURL) {
		this.callBackURL = callBackURL;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public Boolean getIsSaasApplication() {
		return isSaasApplication;
	}

	public void setIsSaasApplication(Boolean isSaasApplication) {
		this.isSaasApplication = isSaasApplication;
	}

	public Object getAppOwner() {
		return appOwner;
	}

	public void setAppOwner(Object appOwner) {
		this.appOwner = appOwner;
	}

	public String getJsonString() {
		return jsonString;
	}

	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}

}