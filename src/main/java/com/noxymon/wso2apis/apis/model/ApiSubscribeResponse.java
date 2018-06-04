package com.noxymon.wso2apis.apis.model;

public class ApiSubscribeResponse {

    private String subscriptionId;
    private String applicationId;
    private String apiIdentifier;
    private String tier;
    private String status;

    public String getSubscriptionId() {
	return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
	this.subscriptionId = subscriptionId;
    }

    public String getApplicationId() {
	return applicationId;
    }

    public void setApplicationId(String applicationId) {
	this.applicationId = applicationId;
    }

    public String getApiIdentifier() {
	return apiIdentifier;
    }

    public void setApiIdentifier(String apiIdentifier) {
	this.apiIdentifier = apiIdentifier;
    }

    public String getTier() {
	return tier;
    }

    public void setTier(String tier) {
	this.tier = tier;
    }

    public String getStatus() {
	return status;
    }

    public void setStatus(String status) {
	this.status = status;
    }

}