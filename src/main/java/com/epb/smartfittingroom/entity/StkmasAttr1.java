package com.epb.smartfittingroom.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StkmasAttr1 {

	@Id
	private BigDecimal recKey;
	private String stkattr1;
	private String name;
	private String stkId;
	private BigDecimal sortNum;

	public StkmasAttr1() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public String getStkattr1() {
		return stkattr1;
	}

	public void setStkattr1(String stkattr1) {
		this.stkattr1 = stkattr1;
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

	public BigDecimal getSortNum() {
		return sortNum;
	}

	public void setSortNum(BigDecimal sortNum) {
		this.sortNum = sortNum;
	}

}
