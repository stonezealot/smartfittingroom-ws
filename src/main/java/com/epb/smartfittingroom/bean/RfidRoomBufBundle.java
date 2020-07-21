package com.epb.smartfittingroom.bean;

import java.util.List;

import com.epb.smartfittingroom.entity.RfidRoomBufView;
import com.epb.smartfittingroom.entity.RfidRoomReqBufView;

public class RfidRoomBufBundle {

	private List<RfidRoomBufView> rfidRoomBufViews;
	private List<RfidRoomReqBufView> rfidRoomReqBufViews;

	public RfidRoomBufBundle() {
		super();
	}

	public RfidRoomBufBundle(List<RfidRoomBufView> rfidRoomBufViews, List<RfidRoomReqBufView> rfidRoomReqBufViews) {
		super();
		this.rfidRoomBufViews = rfidRoomBufViews;
		this.rfidRoomReqBufViews = rfidRoomReqBufViews;
	}

	public List<RfidRoomBufView> getRfidRoomBufViews() {
		return rfidRoomBufViews;
	}

	public void setRfidRoomBufViews(List<RfidRoomBufView> rfidRoomBufViews) {
		this.rfidRoomBufViews = rfidRoomBufViews;
	}

	public List<RfidRoomReqBufView> getRfidRoomReqBufViews() {
		return rfidRoomReqBufViews;
	}

	public void setRfidRoomReqBufViews(List<RfidRoomReqBufView> rfidRoomReqBufViews) {
		this.rfidRoomReqBufViews = rfidRoomReqBufViews;
	}

}
