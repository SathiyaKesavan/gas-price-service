package com.price.gas.dataaccess;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.price.gas.model.GasPriceTrend;
import com.price.gas.model.StateGasPrice;
import com.price.gas.repository.GasPriceRepository;
import com.price.gas.repository.GasPriceTrendRepository;

@Component
public class GasPriceDataAccessController {
	
	
	@Autowired
	private GasPriceRepository gasPriceRepository;
	
	@Autowired
	private GasPriceTrendRepository gasPriceTrendRepository;
	
	
	public Optional<StateGasPrice> getRecord(String date) {
		return gasPriceRepository.findById(date);
		
	}
	
	public List<GasPriceTrend> getAllRecords() {
		return gasPriceTrendRepository.findAll();
	}
	
	


	

}
