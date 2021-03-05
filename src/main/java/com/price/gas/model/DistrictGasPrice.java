package com.price.gas.model;

import java.util.List;

public class DistrictGasPrice {
	
    private String district;
    private List<GasPrice> products;
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public List<GasPrice> getProducts() {
		return products;
	}
	public void setProducts(List<GasPrice> products) {
		this.products = products;
	}

}
