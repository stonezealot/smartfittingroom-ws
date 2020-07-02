package com.epb.smartfittingroom.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AppStockInfo {

	@Id
	private BigDecimal recKey;
	private String userId;
	private String storeId;
	private String name;
	private String stkId;
	private String stkattr1;
	private String stkattr2;
	private BigDecimal stkQty;
	private BigDecimal atpQty;
	private BigDecimal atdQty;
	private BigDecimal totalInQty;
	private BigDecimal totalSellQty;
	private BigDecimal totalOtherinQty;
	private BigDecimal totalOtheroutQty;

	public AppStockInfo() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStkId() {
		return stkId;
	}

	public void setStkId(String stkId) {
		this.stkId = stkId;
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

	public BigDecimal getStkQty() {
		return stkQty;
	}

	public void setStkQty(BigDecimal stkQty) {
		this.stkQty = stkQty;
	}

	public BigDecimal getAtpQty() {
		return atpQty;
	}

	public void setAtpQty(BigDecimal atpQty) {
		this.atpQty = atpQty;
	}

	public BigDecimal getAtdQty() {
		return atdQty;
	}

	public void setAtdQty(BigDecimal atdQty) {
		this.atdQty = atdQty;
	}

	public BigDecimal getTotalInQty() {
		return totalInQty;
	}

	public void setTotalInQty(BigDecimal totalInQty) {
		this.totalInQty = totalInQty;
	}

	public BigDecimal getTotalSellQty() {
		return totalSellQty;
	}

	public void setTotalSellQty(BigDecimal totalSellQty) {
		this.totalSellQty = totalSellQty;
	}

	public BigDecimal getTotalOtherinQty() {
		return totalOtherinQty;
	}

	public void setTotalOtherinQty(BigDecimal totalOtherinQty) {
		this.totalOtherinQty = totalOtherinQty;
	}

	public BigDecimal getTotalOtheroutQty() {
		return totalOtheroutQty;
	}

	public void setTotalOtheroutQty(BigDecimal totalOtheroutQty) {
		this.totalOtheroutQty = totalOtheroutQty;
	}

}
