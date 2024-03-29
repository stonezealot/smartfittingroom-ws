package com.epb.smartfittingroom.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RfidRoomReqBufView {

	@Id
	private BigDecimal recKey;
	private String orgId;
	private String locId;
	private String shopId;
	private String userId;
	private BigDecimal roomRecKey;
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
	private BigDecimal seqNo;
	private String statusFlg;
	private Date createDate;
	private Date ackDate;
	private Date sendDate;
	private BigDecimal images;

	public RfidRoomReqBufView() {
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

	public BigDecimal getRoomRecKey() {
		return roomRecKey;
	}

	public void setRoomRecKey(BigDecimal roomRecKey) {
		this.roomRecKey = roomRecKey;
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

	public BigDecimal getImages() {
		return images;
	}

	public void setImages(BigDecimal images) {
		this.images = images;
	}

}
