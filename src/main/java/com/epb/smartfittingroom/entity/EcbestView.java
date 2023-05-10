package com.epb.smartfittingroom.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EcbestView {

	@Id
	private BigDecimal recKey;
	private String orgId;
	private String ecbestId;
	private String ecbestName;
	private BigDecimal eccatSortNum;
	private BigDecimal ecskuSortNum;
	private String eccatId;
	private String eccatName;
	private String stkId;
	private String stkName;
	private String model;
	private String urlAddr;
	private BigDecimal retailListPrice;

	public EcbestView() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getEcbestId() {
		return ecbestId;
	}

	public void setEcbestId(String ecbestId) {
		this.ecbestId = ecbestId;
	}

	public String getEcbestName() {
		return ecbestName;
	}

	public void setEcbestName(String ecbestName) {
		this.ecbestName = ecbestName;
	}

	public BigDecimal getEccatSortNum() {
		return eccatSortNum;
	}

	public void setEccatSortNum(BigDecimal eccatSortNum) {
		this.eccatSortNum = eccatSortNum;
	}

	public BigDecimal getEcskuSortNum() {
		return ecskuSortNum;
	}

	public void setEcskuSortNum(BigDecimal ecskuSortNum) {
		this.ecskuSortNum = ecskuSortNum;
	}

	public String getEccatId() {
		return eccatId;
	}

	public void setEccatId(String eccatId) {
		this.eccatId = eccatId;
	}

	public String getEccatName() {
		return eccatName;
	}

	public void setEccatName(String eccatName) {
		this.eccatName = eccatName;
	}

	public String getStkId() {
		return stkId;
	}

	public void setStkId(String stkId) {
		this.stkId = stkId;
	}

	public String getStkName() {
		return stkName;
	}

	public void setStkName(String stkName) {
		this.stkName = stkName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getUrlAddr() {
		return urlAddr;
	}

	public void setUrlAddr(String urlAddr) {
		this.urlAddr = urlAddr;
	}

	public BigDecimal getRetailListPrice() {
		return retailListPrice;
	}

	public void setRetailListPrice(BigDecimal retailListPrice) {
		this.retailListPrice = retailListPrice;
	}

}
