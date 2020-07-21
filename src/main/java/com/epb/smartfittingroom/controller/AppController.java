package com.epb.smartfittingroom.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.epb.smartfittingroom.bean.RfidRoomBufBundle;
import com.epb.smartfittingroom.bean.StockInfo;
import com.epb.smartfittingroom.entity.AppStockInfo;
import com.epb.smartfittingroom.entity.EcbestSku;
import com.epb.smartfittingroom.entity.RfidRoomBufView;
import com.epb.smartfittingroom.entity.RfidRoomReqBufView;
import com.epb.smartfittingroom.entity.StkmasAttr1;
import com.epb.smartfittingroom.entity.StkmasAttr2;
import com.epb.smartfittingroom.repository.AppStockInfoRepository;
import com.epb.smartfittingroom.repository.EcbestSkuRepository;
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
	public ResponseEntity<RfidRoomBufBundle> getRfidRoomBufBundle(@RequestParam final String roomNo) {

		final List<RfidRoomBufView> rfidRoomBufViews = this.rfidRoomBufViewRepository.findByRoomNoOrderByRecKey(roomNo);

		final List<RfidRoomReqBufView> rfidRoomReqBufViews = this.rfidRoomReqBufViewRepository
				.findByRoomNoOrderByRecKey(roomNo);

		return ResponseEntity.ok(new RfidRoomBufBundle(rfidRoomBufViews, rfidRoomReqBufViews));
	}

	@GetMapping("/highlights")
	public ResponseEntity<List<EcbestSku>> gethighlights(@RequestParam final String orgId) {

		final List<EcbestSku> ecbestSkus = this.ecbestSkuRepository.findByOrgIdOrderBySortNum(orgId);

		return ResponseEntity.ok(ecbestSkus);
	}

	@GetMapping("/stock-info")
	public ResponseEntity<StockInfo> getStockInfo(@RequestParam final String orgId, @RequestParam final String locId,
			@RequestParam final String userId, @RequestParam final String stkId) {

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
			@RequestParam final String orgId,
			@RequestParam final String locId,
			@RequestParam final String roomId,
			@RequestParam final String stkId,
			@RequestParam final String stkattr1,
			@RequestParam final String stkattr2) {

		final ProcedureResponse response = this.procedureService.smartfittingroomRequest(
				"",
				orgId,
				locId,
				roomId,
				stkId,
				stkattr1,
				stkattr2);

		if (!ProcedureService.ERR_CODE_OK.equals(response.getErrCode())) {
			throw new RuntimeException(response.getErrMsg());
		}

		final List<RfidRoomBufView> rfidRoomBufViews = this.rfidRoomBufViewRepository.findByRoomNoOrderByRecKey(roomId);

		final List<RfidRoomReqBufView> rfidRoomReqBufViews = this.rfidRoomReqBufViewRepository
				.findByRoomNoOrderByRecKey(roomId);

		return ResponseEntity.ok(new RfidRoomBufBundle(rfidRoomBufViews, rfidRoomReqBufViews));
	}

	//
	// request mappings
	//

	//
	// fields
	//

	private final Log log = LogFactory.getLog(AppController.class);

	private final RfidRoomBufViewRepository rfidRoomBufViewRepository;
	private final RfidRoomReqBufViewRepository rfidRoomReqBufViewRepository;
	private final StkmasAttr1Repository stkmasAttr1Repository;
	private final StkmasAttr2Repository stkmasAttr2Repository;
	private final AppStockInfoRepository appStockInfoRepository;
	private final EcbestSkuRepository ecbestSkuRepository;

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
			final EcbestSkuRepository ecbestSkuRepository) {

		super();

		this.procedureService = procedureService;
		this.rfidRoomBufViewRepository = rfidRoomBufViewRepository;
		this.rfidRoomReqBufViewRepository = rfidRoomReqBufViewRepository;
		this.stkmasAttr1Repository = stkmasAttr1Repository;
		this.stkmasAttr2Repository = stkmasAttr2Repository;
		this.appStockInfoRepository = appStockInfoRepository;
		this.ecbestSkuRepository = ecbestSkuRepository;
	}

}
