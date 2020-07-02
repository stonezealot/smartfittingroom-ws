package com.epb.smartfittingroom.bean;

import java.util.List;

import com.epb.smartfittingroom.entity.RfidRoomBuf;
import com.epb.smartfittingroom.entity.RfidRoomReqBuf;

public class RfidRoomBufBundle {

	private List<RfidRoomBuf> rfidRoomBufs;
	private List<RfidRoomReqBuf> rfidRoomReqBufs;

	public RfidRoomBufBundle() {
		super();
	}

	public RfidRoomBufBundle(List<RfidRoomBuf> rfidRoomBufs, List<RfidRoomReqBuf> rfidRoomReqBufs) {
		super();
		this.rfidRoomBufs = rfidRoomBufs;
		this.rfidRoomReqBufs = rfidRoomReqBufs;
	}

	public List<RfidRoomBuf> getRfidRoomBufs() {
		return rfidRoomBufs;
	}

	public void setRfidRoomBufs(List<RfidRoomBuf> rfidRoomBufs) {
		this.rfidRoomBufs = rfidRoomBufs;
	}

	public List<RfidRoomReqBuf> getRfidRoomReqBufs() {
		return rfidRoomReqBufs;
	}

	public void setRfidRoomReqBufs(List<RfidRoomReqBuf> rfidRoomReqBufs) {
		this.rfidRoomReqBufs = rfidRoomReqBufs;
	}

}
