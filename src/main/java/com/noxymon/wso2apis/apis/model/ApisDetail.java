package com.noxymon.wso2apis.apis.model;

import java.util.List;

public class ApisDetail {
    private String id;
    private String name;
    private String description;
    private String context;
    private String version;
    private String provider;
    private String status;
    private Object thumbnailUri;
    private List<Object> scopes = null;

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getContext() {
	return context;
    }

    public void setContext(String context) {
	this.context = context;
    }

    public String getVersion() {
	return version;
    }

    public void setVersion(String version) {
	this.version = version;
    }

    public String getProvider() {
	return provider;
    }

    public void setProvider(String provider) {
	this.provider = provider;
    }

    public String getStatus() {
	return status;
    }

    public void setStatus(String status) {
	this.status = status;
    }

    public Object getThumbnailUri() {
	return thumbnailUri;
    }

    public void setThumbnailUri(Object thumbnailUri) {
	this.thumbnailUri = thumbnailUri;
    }

    public java.util.List<Object> getScopes() {
	return scopes;
    }

    public void setScopes(java.util.List<Object> scopes) {
	this.scopes = scopes;
    }
}
