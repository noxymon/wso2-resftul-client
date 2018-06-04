package com.noxymon.wso2apis.apis.model;

import java.util.List;

public class ApisRetrieveResponse {

    private String previous;
    private List<ApisDetail> list = null;
    private Integer count;
    private String next;
    private PaginationDetail paginationDetail;

    public String getPrevious() {
	return previous;
    }

    public void setPrevious(String previous) {
	this.previous = previous;
    }
    
    public List<ApisDetail> getList() {
        return list;
    }

    public void setList(List<ApisDetail> list) {
        this.list = list;
    }

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

    public PaginationDetail getPaginationDetail() {
        return paginationDetail;
    }

    public void setPaginationDetail(PaginationDetail paginationDetail) {
        this.paginationDetail = paginationDetail;
    }
    
    
}