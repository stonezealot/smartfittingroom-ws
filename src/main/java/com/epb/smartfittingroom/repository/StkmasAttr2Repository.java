package com.epb.smartfittingroom.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.smartfittingroom.entity.StkmasAttr2;

public interface StkmasAttr2Repository
		extends JpaRepository<StkmasAttr2, BigDecimal> {

	List<StkmasAttr2> findByStkIdOrderBySortNum(String stkId);
}
