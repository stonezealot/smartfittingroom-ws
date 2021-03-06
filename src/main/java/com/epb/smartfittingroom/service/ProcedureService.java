package com.epb.smartfittingroom.service;

public interface ProcedureService {

	ProcedureResponse getStockInfo(
			String charset,
			String orgId,
			String locId,
			String userId,
			String stkId);

	ProcedureResponse smartfittingroomRequest(
			String charset,
			String orgId,
			String locId,
			String roomNo,
			String stkId,
			String stkattr1,
			String stkattr2);

	static final String ERR_CODE_OK = "OK";
}
