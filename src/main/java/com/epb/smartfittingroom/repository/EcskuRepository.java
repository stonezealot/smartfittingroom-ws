package com.epb.smartfittingroom.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.epb.smartfittingroom.entity.Ecsku;

public interface EcskuRepository
		extends JpaRepository<Ecsku, BigDecimal> {

	@Query("select e from Ecsku e "
			+ "where (orgId is null or orgId = ?1) and eccatId like ?2 "
			+ "order by sortNum,stkId")
	List<Ecsku> findEcsku(String orgId, String eccatId);
}
