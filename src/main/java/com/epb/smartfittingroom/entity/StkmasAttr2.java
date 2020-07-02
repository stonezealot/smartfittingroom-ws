package com.epb.smartfittingroom.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StkmasAttr2 {

	@Id
	private BigDecimal recKey;
	private String stkattr2;
	private String name;
	private String stkId;
	private BigDecimal sortNum;

	public StkmasAttr2() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public String getStkattr2() {
		return stkattr2;
	}

	public void setStkattr2(String stkattr2) {
		this.stkattr2 = stkattr2;
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
