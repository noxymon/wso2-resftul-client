package com.noxymon.wso2apis.application.model;

public class ApplicationsResponse {

	private Integer count;
	private String next;
	private String previous;
	private java.util.List<ApplicationDetail> list = null;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public java.util.List<ApplicationDetail> getList() {
		return list;
	}

	public void setList(java.util.List<ApplicationDetail> list) {
		this.list = list;
	}

}