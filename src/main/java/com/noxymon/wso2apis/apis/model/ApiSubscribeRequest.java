package com.noxymon.wso2apis.apis.model;

public class ApiSubscribeRequest {
    private String tier;
    private String apiIdentifier;
    private String applicationId;

    public String getTier() {
	return tier;
    }

    public void setTier(String tier) {
	this.tier = tier;
    }

    public String getApiIdentifier() {
	return apiIdentifier;
    }

    public void setApiIdentifier(String apiIdentifier) {
	this.apiIdentifier = apiIdentifier;
    }

    public String getApplicationId() {
	return applicationId;
    }

    public void setApplicationId(String applicationId) {
	this.applicationId = applicationId;
    }
}