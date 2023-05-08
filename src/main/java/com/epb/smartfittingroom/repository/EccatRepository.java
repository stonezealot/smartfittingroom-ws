package com.epb.smartfittingroom.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.epb.smartfittingroom.entity.Eccat;

public interface EccatRepository extends JpaRepository<Eccat, BigDecimal> {

	@Query("select e from Eccat e "
			+ "where (orgId is null or orgId = ?1) "
			+ "order by sortNum")
	List<Eccat> findEccat(String orgId);
}
