package com.price.gas.dataaccess;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.price.gas.model.GasPrices;
import com.price.gas.repository.GasPriceRepository;

@Component
public class GasPriceDataAccessController {

	@Autowired
	private GasPriceRepository gasPriceRepository;

	// fetch document by identifier which is the date field
	public Optional<GasPrices> getRecord(String date) {
		return gasPriceRepository.findById(date);

	}

	// fetch historical trend by querying all records. 
	public List<GasPrices> getAllRecords() {
		return gasPriceRepository.findAll();
	}

}
