package com.epb.smartfittingroom.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ecsku {

	@Id
	private BigDecimal recKey;
	private String timeStamp;
	private String orgId;
	private BigDecimal sortNum;
	private String stkId;
	private String name;
	private String model;
	private String uomId;
	private String statusFlg;
	private String brandId;
	private String eccatId;
	private String ecsubcatId;
	private String ec3rdcatId;
	private BigDecimal listPrice;
	private BigDecimal netPrice;
	private String urlAddr;
	private String remark;
	public Ecsku() {
		super();
	}
	public BigDecimal getRecKey() {
		return recKey;
	}
	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public BigDecimal getSortNum() {
		return sortNum;
	}
	public void setSortNum(BigDecimal sortNum) {
		this.sortNum = sortNum;
	}
	public String getStkId() {
		return stkId;
	}
	public void setStkId(String stkId) {
		this.stkId = stkId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getStatusFlg() {
		return statusFlg;
	}
	public void setStatusFlg(String statusFlg) {
		this.statusFlg = statusFlg;
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
	public String getEc3rdcatId() {
		return ec3rdcatId;
	}
	public void setEc3rdcatId(String ec3rdcatId) {
		this.ec3rdcatId = ec3rdcatId;
	}
	public BigDecimal getListPrice() {
		return listPrice;
	}
	public void setListPrice(BigDecimal listPrice) {
		this.listPrice = listPrice;
	}
	public BigDecimal getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(BigDecimal netPrice) {
		this.netPrice = netPrice;
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

}
