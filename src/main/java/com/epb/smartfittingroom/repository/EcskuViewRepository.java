package com.epb.smartfittingroom.repository;

import java.math.BigDecimal;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.epb.smartfittingroom.entity.EcskuView;

public interface EcskuViewRepository
		extends JpaRepository<EcskuView, BigDecimal> {

	@Query("select e from EcskuView e "
			+ "where (orgId is null or orgId = ?1) and eccatId like ?2 "
			+ "order by sortNum,stkId")
	Page<EcskuView> findEcskuView(String orgId, String eccatId, final Pageable pageable);
}
