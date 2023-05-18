package com.epb.smartfittingroom.bean;

public class SmartfittingroomPayload {

	private String orgId;
	private String locId;
	private String userId;
	private String reqRecKey;

	public SmartfittingroomPayload() {
		super();
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getLocId() {
		return locId;
	}

	public void setLocId(String locId) {
		this.locId = locId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getReqRecKey() {
		return reqRecKey;
	}

	public void setReqRecKey(String reqRecKey) {
		this.reqRecKey = reqRecKey;
	}

}
