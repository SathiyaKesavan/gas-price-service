package com.price.gas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.price.gas.dataaccess.GasPriceDataAccessController;
import com.price.gas.model.GasPriceTrendResult;
import com.price.gas.model.StateGasPrice;

@RestController
@RequestMapping("/gasprice")
public class GasPriceServiceController {
	
	
	@Autowired
	private GasPriceDataAccessController gasPriceDataAccessController;
	
	//Rest API to fetch current days' gas price for a given state
	@CrossOrigin(origins = "${crossorigin.url}")
	@RequestMapping("/{state}")
	public StateGasPrice getGasPriceDetails(@PathVariable("state") String stateRequest) {
		
		return gasPriceDataAccessController.getRecord(new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime())).get();
    	
	}
	
	//Rest API to fetch historical trend on gas price 
	@CrossOrigin(origins = "${crossorigin.url}")
	@RequestMapping("/trend")
	public GasPriceTrendResult getGasPriceTrend() {
		GasPriceTrendResult result = new GasPriceTrendResult();
		result.setDate(new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()));
		result.setGasPriceTrendList(gasPriceDataAccessController.getAllRecords());
		return result;
    
	}

}
