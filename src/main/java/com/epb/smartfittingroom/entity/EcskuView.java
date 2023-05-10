package com.epb.smartfittingroom.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EcskuView {

	@Id
	private BigDecimal recKey;
	private BigDecimal sortNum;
	private String orgId;
	private String stkId;
	private String stkName;
	private String model;
	private String uomId;
	private String brandId;
	private String eccatId;
	private String ecsubcatId;
	private String ec3RdcatId;
	private String urlAddr;
	private String remark;
	private BigDecimal retailListPrice;

	public EcskuView() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public BigDecimal getSortNum() {
		return sortNum;
	}

	public void setSortNum(BigDecimal sortNum) {
		this.sortNum = sortNum;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
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

	public String getUomId() {
		return uomId;
	}

	public void setUomId(String uomId) {
		this.uomId = uomId;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getEccatId() {
		return eccatId;
	}

	public void setEccatId(String eccatId) {
		this.eccatId = eccatId;
	}

	public String getEcsubcatId() {
		return ecsubcatId;
	}

	public void setEcsubcatId(String ecsubcatId) {
		this.ecsubcatId = ecsubcatId;
	}

	public String getEc3RdcatId() {
		return ec3RdcatId;
	}

	public void setEc3RdcatId(String ec3RdcatId) {
		this.ec3RdcatId = ec3RdcatId;
	}

	public String getUrlAddr() {
		return urlAddr;
	}

	public void setUrlAddr(String urlAddr) {
		this.urlAddr = urlAddr;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public BigDecimal getRetailListPrice() {
		return retailListPrice;
	}

	public void setRetailListPrice(BigDecimal retailListPrice) {
		this.retailListPrice = retailListPrice;
	}

}
