package com.price.gas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.price.gas.model.StateGasPrice;

public interface GasPriceRepository extends MongoRepository<StateGasPrice, String> {

}
