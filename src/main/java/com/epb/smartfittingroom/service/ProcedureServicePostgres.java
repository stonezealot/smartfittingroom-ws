package com.epb.smartfittingroom.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("postgres")
public class ProcedureServicePostgres
		implements ProcedureService {

	@Override
	public ProcedureResponse getStockInfo(
			final String charset,
			final String orgId,
			final String locId,
			final String userId,
			final String stkId) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}

	@Override
	public ProcedureResponse smartfittingroomRequest(
			final String charset,
			final String orgId,
			final String locId,
			final String roomId,
			final String stkId,
			final String stkattr1,
			final String stkattr2) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}

}
