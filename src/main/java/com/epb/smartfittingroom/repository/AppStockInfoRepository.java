package com.epb.smartfittingroom.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.smartfittingroom.entity.AppStockInfo;

public interface AppStockInfoRepository extends JpaRepository<AppStockInfo, BigDecimal> {

	List<AppStockInfo> findByUserId(String userId);
}