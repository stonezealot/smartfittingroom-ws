package com.epb.smartfittingroom.service;

public interface ProcedureService {

	ProcedureResponse getStockInfo(
			String charset,
			String orgId,
			String locId,
			String userId,
			String stkId);

	ProcedureResponse smartfittingroomRequest(
			String orgId,
			String locId,
			String shopId,
			String userId,
			String stkId,
			String stkattr1,
			String stkattr2);

	ProcedureResponse smartfittingroomBuf(
			String orgId,
			String locId,
			String shopId,
			String userId,
			String pluIds);

	ProcedureResponse smartfittingroomAck(
			String orgId,
			String locId,
			String userId,
			String reqRecKey);

	ProcedureResponse smartfittingroomSend(
			String orgId,
			String locId,
			String userId,
			String reqRecKey);

	static final String ERR_CODE_OK = "OK";
}
