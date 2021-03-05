package com.price.gas.model;

import java.util.List;

public class GasPriceTrendResult {
	
	String date;
	List<GasPriceTrend> gasPriceTrendList;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<GasPriceTrend> getGasPriceTrendList() {
		return gasPriceTrendList;
	}
	public void setGasPriceTrendList(List<GasPriceTrend> gasPriceTrendList) {
		this.gasPriceTrendList = gasPriceTrendList;
	}
	
	public GasPriceTrendResult() {
		
	}

	public GasPriceTrendResult(String date, List<GasPriceTrend> gasPriceTrendList) {
		super();
		this.date = date;
		this.gasPriceTrendList = gasPriceTrendList;
	}

}
