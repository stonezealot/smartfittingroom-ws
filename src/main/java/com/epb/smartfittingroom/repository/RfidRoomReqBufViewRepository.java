package com.epb.smartfittingroom.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.smartfittingroom.entity.RfidRoomReqBufView;

public interface RfidRoomReqBufViewRepository
		extends JpaRepository<RfidRoomReqBufView, BigDecimal> {

	List<RfidRoomReqBufView> findByRoomNoOrderByRecKeyDesc(String roomNo);
}
