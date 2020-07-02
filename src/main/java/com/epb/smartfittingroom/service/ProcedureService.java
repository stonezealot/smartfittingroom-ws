package com.epb.smartfittingroom.service;

public interface ProcedureService {

	ProcedureResponse getStockInfo(
			String charset,
			String orgId,
			String locId,
			String userId,
			String stkId);

	static final String ERR_CODE_OK = "OK";
}
