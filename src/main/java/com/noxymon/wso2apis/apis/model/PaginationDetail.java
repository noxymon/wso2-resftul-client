package com.noxymon.wso2apis.apis.model;

public class PaginationDetail {
    private Integer total;
    private Integer offset;
    private Integer limit;

    public Integer getTotal() {
	return total;
    }

    public void setTotal(Integer total) {
	this.total = total;
    }

    public Integer getOffset() {
	return offset;
    }

    public void setOffset(Integer offset) {
	this.offset = offset;
    }

    public Integer getLimit() {
	return limit;
    }

    public void setLimit(Integer limit) {
	this.limit = limit;
    }

}
