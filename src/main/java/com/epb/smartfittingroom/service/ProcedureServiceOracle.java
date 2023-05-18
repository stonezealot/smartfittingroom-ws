package com.epb.smartfittingroom.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

@Service
@Profile("oracle")
public class ProcedureServiceOracle
		implements ProcedureService {

	@Override
	public ProcedureResponse getStockInfo(
			final String charset,
			final String orgId,
			final String locId,
			final String userId,
			final String stkId) {

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_charset", charset)
				.addValue("v_org_id", orgId)
				.addValue("v_loc_id", locId)
				.addValue("v_user_id", userId)
				.addValue("v_stk_id", stkId);

		final Map<String, Object> out = this.getStockInfoCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
	}

	@Override
	public ProcedureResponse smartfittingroomRequest(
			final String orgId,
			final String locId,
			final String shopId,
			final String userId,
			final String stkId,
			final String stkattr1,
			final String stkattr2) {

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_org_id", orgId)
				.addValue("v_loc_id", locId)
				.addValue("v_shop_id", shopId)
				.addValue("v_user_id", userId)
				.addValue("v_stk_id", stkId)
				.addValue("v_stkattr1", stkattr1)
				.addValue("v_stkattr2", stkattr2);

		final Map<String, Object> out = this.smartfittingroomRequestCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
	}

	@Override
	public ProcedureResponse smartfittingroomBuf(
			final String orgId,
			final String locId,
			final String shopId,
			final String userId,
			final String pluIds) {

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_org_id", orgId)
				.addValue("v_loc_id", locId)
				.addValue("v_shop_id", shopId)
				.addValue("v_user_id", userId)
				.addValue("v_plu_ids", pluIds);

		final Map<String, Object> out = this.smartfittingroomBufCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_code") + " : " + (String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
	}

	@Override
	public ProcedureResponse smartfittingroomAck(
			final String orgId,
			final String locId,
			final String userId,
			final String reqRecKey) {

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_org_id", orgId)
				.addValue("v_loc_id", locId)
				.addValue("v_user_id", userId)
				.addValue("v_req_rec_key", reqRecKey);

		final Map<String, Object> out = this.smartfittingroomAckCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_code") + " : " + (String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
	}

	@Override
	public ProcedureResponse smartfittingroomSend(
			final String orgId,
			final String locId,
			final String userId,
			final String reqRecKey) {

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_org_id", orgId)
				.addValue("v_loc_id", locId)
				.addValue("v_user_id", userId)
				.addValue("v_req_rec_key", reqRecKey);

		final Map<String, Object> out = this.smartfittingroomSendCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_code") + " : " + (String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
	}

	//
	// fields
	//

	private final JdbcTemplate jdbcTemplate;

	private final SimpleJdbcCall getStockInfoCall;
	private final SimpleJdbcCall smartfittingroomRequestCall;
	private final SimpleJdbcCall smartfittingroomBufCall;
	private final SimpleJdbcCall smartfittingroomAckCall;
	private final SimpleJdbcCall smartfittingroomSendCall;

	//
	// constructor
	//

	@Autowired
	public ProcedureServiceOracle(final JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
		this.jdbcTemplate.setResultsMapCaseInsensitive(true);

		this.getStockInfoCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_mobile")
				.withProcedureName("get_stock_info");
		this.smartfittingroomRequestCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_mobileutl")
				.withProcedureName("smartfittingroom_request");
		this.smartfittingroomBufCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_mobileutl")
				.withProcedureName("smartfittingroom_buf");
		this.smartfittingroomAckCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_mobileutl")
				.withProcedureName("smartfittingroom_ack");
		this.smartfittingroomSendCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_mobileutl")
				.withProcedureName("smartfittingroom_send");
	}

}
