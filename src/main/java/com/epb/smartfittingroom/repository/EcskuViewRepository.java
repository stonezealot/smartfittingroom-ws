package com.epb.smartfittingroom.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.epb.smartfittingroom.entity.EcskuView;

public interface EcskuViewRepository
		extends JpaRepository<EcskuView, BigDecimal> {

	@Query("select e from EcskuView e "
			+ "where (orgId is null or orgId = ?1) and eccatId like ?2 "
			+ "order by sortNum,stkId")
	List<EcskuView> findEcskuView(String orgId, String eccatId);
}
