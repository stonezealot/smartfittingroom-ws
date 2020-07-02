package com.epb.smartfittingroom.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RfidRoomReqBuf {

	@Id
	private BigDecimal recKey;
	private String roomNo;
	private String pluId;
	private String stkId;
	private String stkattr1;
	private String stkattr2;
	private BigDecimal seqNo;
	private String statusFlg;
	private Date createDate;
	private Date ackDate;
	private Date sendDate;

	public RfidRoomReqBuf() {
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

	public String getStatusFlg() {
		return statusFlg;
	}

	public void setStatusFlg(String statusFlg) {
		this.statusFlg = statusFlg;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getAckDate() {
		return ackDate;
	}

	public void setAckDate(Date ackDate) {
		this.ackDate = ackDate;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

}
