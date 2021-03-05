package com.price.gas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.price.gas.model.GasPriceTrend;

public interface GasPriceTrendRepository extends MongoRepository<GasPriceTrend, String> {

}
