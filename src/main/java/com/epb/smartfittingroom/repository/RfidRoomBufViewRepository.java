package com.epb.smartfittingroom.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.epb.smartfittingroom.entity.RfidRoomBufView;

public interface RfidRoomBufViewRepository
		extends JpaRepository<RfidRoomBufView, BigDecimal> {

	@Query("select r from RfidRoomBufView r "
			+ "where orgId = ?1 and locId= ?2 and shopId = ?3 and userId = ?4 "
			+ "order by recKey DESC")
	List<RfidRoomBufView> findRfidRoomBufView(String orgId, String locId, String shopId, String userId);
}
