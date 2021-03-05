package com.price.gas.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "GASPRICECOLLECTION")
public class StateGasPrice {
	
	@Id
	private String date;
	private String state;
	private List<DistrictGasPrice> districtPrices;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public List<DistrictGasPrice> getDistrictPrices() {
		return districtPrices;
	}
	public void setDistrictPrices(List<DistrictGasPrice> districtPrices) {
		this.districtPrices = districtPrices;
	}
	

}

