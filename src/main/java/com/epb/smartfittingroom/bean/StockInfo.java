package com.epb.smartfittingroom.bean;

import java.util.List;

import com.epb.smartfittingroom.entity.AppStockInfo;
import com.epb.smartfittingroom.entity.StkmasAttr1;
import com.epb.smartfittingroom.entity.StkmasAttr2;

public class StockInfo {

	private List<StkmasAttr1> stkmasAttr1;
	private List<StkmasAttr2> stkmasAttr2;
	private List<AppStockInfo> appStockInfo;

	public StockInfo() {
		super();
	}

	public StockInfo(List<StkmasAttr1> stkmasAttr1, List<StkmasAttr2> stkmasAttr2, List<AppStockInfo> appStockInfo) {
		super();
		this.stkmasAttr1 = stkmasAttr1;
		this.stkmasAttr2 = stkmasAttr2;
		this.appStockInfo = appStockInfo;
	}

	public List<StkmasAttr1> getStkmasAttr1() {
		return stkmasAttr1;
	}

	public void setStkmasAttr1(List<StkmasAttr1> stkmasAttr1) {
		this.stkmasAttr1 = stkmasAttr1;
	}

	public List<StkmasAttr2> getStkmasAttr2() {
		return stkmasAttr2;
	}

	public void setStkmasAttr2(List<StkmasAttr2> stkmasAttr2) {
		this.stkmasAttr2 = stkmasAttr2;
	}

	public List<AppStockInfo> getAppStockInfo() {
		return appStockInfo;
	}

	public void setAppStockInfo(List<AppStockInfo> appStockInfo) {
		this.appStockInfo = appStockInfo;
	}

}
