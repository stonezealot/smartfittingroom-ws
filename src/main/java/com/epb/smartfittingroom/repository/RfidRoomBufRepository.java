package com.epb.smartfittingroom.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.smartfittingroom.entity.RfidRoomBuf;

public interface RfidRoomBufRepository
		extends JpaRepository<RfidRoomBuf, BigDecimal> {

	List<RfidRoomBuf> findByRoomNoOrderByRecKey(String roomNo);
}
