package com.price.gas.model;

import java.util.List;

public class GasPricesTrend {
	
	private String date;
	private List<GasPrices> gasPricesList;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<GasPrices> getGasPricesList() {
		return gasPricesList;
	}
	public void setGasPricesList(List<GasPrices> gasPricesList) {
		this.gasPricesList = gasPricesList;
	}

}
