package com.price.gas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.price.gas.dataaccess.GasPriceDataAccessController;
import com.price.gas.model.GasPrices;
import com.price.gas.model.GasPricesTrend;

@RestController
@RequestMapping("/gasprice")
public class GasPriceServiceController {
	
	
	@Autowired
	private GasPriceDataAccessController gasPriceDataAccessController;
	
	//Rest API to fetch current days' gas price for a given state
	@CrossOrigin(origins = "${crossorigin.url}")
	@RequestMapping("/{date}")
	public GasPrices getGasPriceDetails(@PathVariable("date") String date) {
		
		return gasPriceDataAccessController.getRecord(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime())).get();
    	
	}
	
	
	//Rest API to fetch historical trend on gas price 
	@CrossOrigin(origins = "${crossorigin.url}")
	@RequestMapping("/trend")
	public GasPricesTrend getGasPriceTrend() {
		GasPricesTrend result = new GasPricesTrend();
		result.setDate(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()));
		result.setGasPricesList(gasPriceDataAccessController.getAllRecords());
		return result;
    
	}

}
