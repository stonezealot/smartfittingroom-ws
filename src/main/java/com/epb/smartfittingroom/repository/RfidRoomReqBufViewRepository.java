package com.epb.smartfittingroom.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.epb.smartfittingroom.entity.RfidRoomReqBufView;

public interface RfidRoomReqBufViewRepository
		extends JpaRepository<RfidRoomReqBufView, BigDecimal> {

	@Query("select r from RfidRoomReqBufView r "
			+ "where orgId = ?1 and locId= ?2 and userId = ?3 "
			+ "order by recKey DESC")
	List<RfidRoomReqBufView> findRfidRoomReqBufView(String orgId, String locId, String userId);
}
