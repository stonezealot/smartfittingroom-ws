package com.epb.smartfittingroom.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RfidRoomBufView {

	@Id
	private BigDecimal recKey;
	private String orgId;
	private String locId;
	private String shopId;
	private String userId;
	private String pluId;
	private String stkId;
	private String stkName;
	private String model;
	private String uomId;
	private String stkattr1;
	private String stkattr2;
	private BigDecimal retailListPrice;
	@Column(name = "STKATTR1_SORT_NUM")
	private BigDecimal stkattr1SortNum;

	public RfidRoomBufView() {
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

	public String getLocId() {
		return locId;
	}

	public void setLocId(String locId) {
		this.locId = locId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPluId() {
		return pluId;
	}

	public void setPluId(String pluId) {
		this.pluId = pluId;
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

	public String getStkattr1() {
		return stkattr1;
	}

	public void setStkattr1(String stkattr1) {
		this.stkattr1 = stkattr1;
	}

	public String getStkattr2() {
		return stkattr2;
	}

	public void setStkattr2(String stkattr2) {
		this.stkattr2 = stkattr2;
	}

	public BigDecimal getRetailListPrice() {
		return retailListPrice;
	}

	public void setRetailListPrice(BigDecimal retailListPrice) {
		this.retailListPrice = retailListPrice;
	}

	public BigDecimal getStkattr1SortNum() {
		return stkattr1SortNum;
	}

	public void setStkattr1SortNum(BigDecimal stkattr1SortNum) {
		this.stkattr1SortNum = stkattr1SortNum;
	}

}
