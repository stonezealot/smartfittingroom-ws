package com.epb.smartfittingroom.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.smartfittingroom.entity.StkmasAttr1;

public interface StkmasAttr1Repository
		extends JpaRepository<StkmasAttr1, BigDecimal> {

	List<StkmasAttr1> findByStkIdOrderBySortNum(String stkId);
}
