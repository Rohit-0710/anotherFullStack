package com.deloitte.services;

import org.springframework.stereotype.Component;

import com.deloitte.model.BeerModel;

@Component
public interface BeerService {

//	public BeerModel getBeerByID(UUID beerId);
//
//	public BeerModel saveNewBeer(BeerModel beerModel);
//
//	public void update(UUID beerId, BeerModel beerModel);
//
//	public void delete(UUID beerId);

	public void saveToRepo(BeerModel beerModel);

	public BeerModel findById(String documentID);

}
