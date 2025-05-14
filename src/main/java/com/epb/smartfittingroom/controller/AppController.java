package com.epb.smartfittingroom.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.epb.smartfittingroom.bean.RfidRoomBufBundle;
import com.epb.smartfittingroom.bean.SmartfittingroomPayload;
import com.epb.smartfittingroom.bean.StockInfo;
import com.epb.smartfittingroom.entity.AppStockInfo;
import com.epb.smartfittingroom.entity.EcbestView;
import com.epb.smartfittingroom.entity.Eccat;
import com.epb.smartfittingroom.entity.EcskuView;
import com.epb.smartfittingroom.entity.RfidRoomBufView;
import com.epb.smartfittingroom.entity.RfidRoomReqBufView;
import com.epb.smartfittingroom.entity.StkmasAttr1;
import com.epb.smartfittingroom.entity.StkmasAttr2;
import com.epb.smartfittingroom.repository.AppStockInfoRepository;
import com.epb.smartfittingroom.repository.EcbestViewRepository;
import com.epb.smartfittingroom.repository.EccatRepository;
import com.epb.smartfittingroom.repository.EcskuViewRepository;
import com.epb.smartfittingroom.repository.RfidRoomBufViewRepository;
import com.epb.smartfittingroom.repository.RfidRoomReqBufViewRepository;
import com.epb.smartfittingroom.repository.StkmasAttr1Repository;
import com.epb.smartfittingroom.repository.StkmasAttr2Repository;
import com.epb.smartfittingroom.service.ProcedureResponse;
import com.epb.smartfittingroom.service.ProcedureService;

@RestController
@RequestMapping("/api")
public class AppController {

	@GetMapping("/room-items")
	public ResponseEntity<RfidRoomBufBundle> getRfidRoomBufBundle(
			@RequestParam
			final String orgId,
			@RequestParam
			final String locId,
			@RequestParam
			final String userId) {
		
		this.log.info("orgId: " + orgId + " locId: " + locId + " userId: " + userId);

		final List<RfidRoomBufView> rfidRoomBufViews = this.rfidRoomBufViewRepository
				.findRfidRoomBufView(orgId, locId, userId);

		final List<RfidRoomReqBufView> rfidRoomReqBufViews = this.rfidRoomReqBufViewRepository
				.findRfidRoomReqBufView(orgId, locId, userId);

		return ResponseEntity.ok(new RfidRoomBufBundle(rfidRoomBufViews, rfidRoomReqBufViews));
	}

	@GetMapping("/highlights")
	public ResponseEntity<List<EcbestView>> gethighlights(
			@RequestParam
			final String orgId) {

		final List<EcbestView> ecbestView = this.ecbestViewRepository.findEcbestView(orgId);

		return ResponseEntity.ok(ecbestView);
	}

	@GetMapping("/stock-info")
	public ResponseEntity<StockInfo> getStockInfo(
			@RequestParam
			final String orgId,
			@RequestParam
			final String locId,
			@RequestParam
			final String userId,
			@RequestParam
			final String stkId) {

		final ProcedureResponse response = this.procedureService.getStockInfo("", orgId, locId, userId, stkId);

		if (!ProcedureService.ERR_CODE_OK.equals(response.getErrCode())) {
			throw new RuntimeException(response.getErrMsg());
		}

		final List<StkmasAttr1> stkmasAttr1s = this.stkmasAttr1Repository.findByStkIdOrderBySortNum(stkId);

		final List<StkmasAttr2> stkmasAttr2s = this.stkmasAttr2Repository.findByStkIdOrderBySortNum(stkId);

		final List<AppStockInfo> appStockInfos = this.appStockInfoRepository.findByUserId(userId);

		return ResponseEntity.ok(new StockInfo(stkmasAttr1s, stkmasAttr2s, appStockInfos));
	}

	@PostMapping("/request")
	public ResponseEntity<RfidRoomBufBundle> smartfittingroomRequest(
			@RequestParam
			final String orgId,
			@RequestParam
			final String locId,
			@RequestParam
			final String shopId,
			@RequestParam
			final String userId,
			@RequestParam
			final String stkId,
			@RequestParam
			final String stkattr1,
			@RequestParam
			final String stkattr2) {

		final ProcedureResponse response = this.procedureService.smartfittingroomRequest(
				orgId,
				locId,
				shopId,
				userId,
				stkId,
				stkattr1,
				stkattr2);

		if (!ProcedureService.ERR_CODE_OK.equals(response.getErrCode())) {
			throw new RuntimeException(response.getErrMsg());
		}

		return this.getRfidRoomBufBundle(orgId, locId, userId);
	}

	@GetMapping("/categories")
	public ResponseEntity<List<Eccat>> getEccats(
			@RequestParam
			final String orgId) {

		final List<Eccat> eccat = this.eccatRepository.findEccat(orgId);

		return ResponseEntity.ok(eccat);
	}

	@GetMapping("/ecsku")
	public ResponseEntity<Page<EcskuView>> getEcskuView(
			@RequestParam
			final String orgId,
			@RequestParam(required = false)
			final String eccatId,
			final Pageable pageable) {

		final Page<EcskuView> ecskuView = this.ecskuRepository.findEcskuView(orgId, eccatId == null ? "%" : eccatId,
				pageable);

		return ResponseEntity.ok(ecskuView);
	}

	@PostMapping("/upload-plu")
	public ResponseEntity<ProcedureResponse> uploadPluIds(
			@RequestParam
			final String orgId,
			@RequestParam
			final String locId,
			@RequestParam
			final String shopId,
			@RequestParam
			final String userId,
			@RequestParam
			final String pluIds) {

		final ProcedureResponse response = this.procedureService.smartfittingroomBuf(orgId, locId, shopId, userId,
				pluIds);

		if (!ProcedureService.ERR_CODE_OK.equals(response.getErrCode())) {
			throw new RuntimeException(response.getErrMsg());
		}

		return ResponseEntity.ok(response);
	}

	@PostMapping("/acknowledge")
	public ResponseEntity<ProcedureResponse> smartfittingroomAck(
			@RequestBody
			final SmartfittingroomPayload payload) {

		final ProcedureResponse response = this.procedureService.smartfittingroomAck(
				payload.getOrgId(),
				payload.getLocId(),
				payload.getUserId(),
				payload.getReqRecKey());

		if (!ProcedureService.ERR_CODE_OK.equals(response.getErrCode())) {
			throw new RuntimeException(response.getErrMsg());
		}

		return ResponseEntity.ok(response);
	}

	@PostMapping("/send")
	public ResponseEntity<ProcedureResponse> smartfittingroomSend(
			@RequestBody
			final SmartfittingroomPayload payload) {

		final ProcedureResponse response = this.procedureService.smartfittingroomSend(
				payload.getOrgId(),
				payload.getLocId(),
				payload.getUserId(),
				payload.getReqRecKey());

		if (!ProcedureService.ERR_CODE_OK.equals(response.getErrCode())) {
			throw new RuntimeException(response.getErrMsg());
		}

		return ResponseEntity.ok(response);
	}

	@GetMapping("/room-request")
	public ResponseEntity<List<RfidRoomReqBufView>> getRfidRoomReqBufView(
			@RequestParam
			final String locId) {

		final List<RfidRoomReqBufView> rfidRoomReqBufView = this.rfidRoomReqBufViewRepository
				.findRfidRoomReqBufView(locId);

		return ResponseEntity.ok(rfidRoomReqBufView);

	}

	//
	// fields
	//

	private final Log log = LogFactory.getLog(AppController.class);

	private final RfidRoomBufViewRepository rfidRoomBufViewRepository;
	private final RfidRoomReqBufViewRepository rfidRoomReqBufViewRepository;
	private final StkmasAttr1Repository stkmasAttr1Repository;
	private final StkmasAttr2Repository stkmasAttr2Repository;
	private final AppStockInfoRepository appStockInfoRepository;
	private final EcbestViewRepository ecbestViewRepository;
	private final EccatRepository eccatRepository;
	private final EcskuViewRepository ecskuRepository;

	private final ProcedureService procedureService;

	//
	// constructor
	//

	@Autowired
	public AppController(
			final ProcedureService procedureService,
			final RfidRoomBufViewRepository rfidRoomBufViewRepository,
			final RfidRoomReqBufViewRepository rfidRoomReqBufViewRepository,
			final StkmasAttr1Repository stkmasAttr1Repository,
			final StkmasAttr2Repository stkmasAttr2Repository,
			final AppStockInfoRepository appStockInfoRepository,
			final EcbestViewRepository ecbestViewRepository,
			final EccatRepository eccatRepository,
			final EcskuViewRepository ecskuRepository) {

		super();

		this.procedureService = procedureService;
		this.rfidRoomBufViewRepository = rfidRoomBufViewRepository;
		this.rfidRoomReqBufViewRepository = rfidRoomReqBufViewRepository;
		this.stkmasAttr1Repository = stkmasAttr1Repository;
		this.stkmasAttr2Repository = stkmasAttr2Repository;
		this.appStockInfoRepository = appStockInfoRepository;
		this.ecbestViewRepository = ecbestViewRepository;
		this.eccatRepository = eccatRepository;
		this.ecskuRepository = ecskuRepository;

	}

}
