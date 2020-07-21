package com.epb.smartfittingroom.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.smartfittingroom.entity.RfidRoomBufView;

public interface RfidRoomBufViewRepository
		extends JpaRepository<RfidRoomBufView, BigDecimal> {

	List<RfidRoomBufView> findByRoomNoOrderByRecKey(String roomNo);
}
