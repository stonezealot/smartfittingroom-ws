package com.epb.smartfittingroom.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.epb.smartfittingroom.entity.EcbestView;

public interface EcbestViewRepository
		extends JpaRepository<EcbestView, BigDecimal> {

	@Query("select e from EcbestView e "
			+ "where orgId = ?1 "
			+ "order by orgId, ecbestId, eccatSortNum, ecskuSortNum, stkId")
	List<EcbestView> findEcbestView(String orgId);
}
