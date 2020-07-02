package com.epb.smartfittingroom.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.smartfittingroom.entity.EcbestSku;

public interface EcbestSkuRepository
		extends JpaRepository<EcbestSku, BigDecimal> {

	List<EcbestSku> findByOrgIdOrderBySortNum(String orgId);
}
