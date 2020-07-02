package com.epb.smartfittingroom.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.smartfittingroom.entity.RfidRoomReqBuf;

public interface RfidRoomReqBufRepository
		extends JpaRepository<RfidRoomReqBuf, BigDecimal> {

	List<RfidRoomReqBuf> findByRoomNoOrderByRecKey(String roomNo);
}
