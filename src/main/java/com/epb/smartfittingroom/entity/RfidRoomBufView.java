package com.epb.smartfittingroom.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RfidRoomBufView {

	@Id
	private BigDecimal recKey;
	private String roomNo;
	private String tagId;
	private String pluId;
	private String stkId;
	private String name;
	private String model;
	private String uomId;
	private String stkattr1;
	private String stkattr2;
	private BigDecimal seqNo;
	private BigDecimal countNo;
	private Date createDate;
	private Date modifyDate;

	public RfidRoomBufView() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getTagId() {
		return tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
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

	public BigDecimal getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(BigDecimal seqNo) {
		this.seqNo = seqNo;
	}

	public BigDecimal getCountNo() {
		return countNo;
	}

	public void setCountNo(BigDecimal countNo) {
		this.countNo = countNo;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

}
