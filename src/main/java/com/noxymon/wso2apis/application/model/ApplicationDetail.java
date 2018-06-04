package com.noxymon.wso2apis.application.model;

public class ApplicationDetail {
	private String applicationId;
	private String name;
	private String subscriber;
	private String throttlingTier;
	private String description;
	private String status;
	private String groupId;

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(String subscriber) {
		this.subscriber = subscriber;
	}

	public String getThrottlingTier() {
		return throttlingTier;
	}

	public void setThrottlingTier(String throttlingTier) {
		this.throttlingTier = throttlingTier;
	}

	public Object getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
}
