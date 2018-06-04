package com.noxymon.wso2apis.register.model;

public class RegisterPayload {

	private String callbackUrl;
	private String clientName;
	private String owner;
	private Boolean saasApp;
	private String grantType;

	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public Boolean getSaasApp() {
		return saasApp;
	}

	public void setSaasApp(Boolean saasApp) {
		this.saasApp = saasApp;
	}

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

}