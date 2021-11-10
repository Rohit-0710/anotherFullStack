package com.deloitte.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.model.BeerModel;
import com.deloitte.repository.BeerServiceMongoRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

	@Autowired
	BeerServiceMongoRepo repo;

//	@Override
//	public BeerModel getBeerByID(UUID beerId) {
//		// TODO Auto-generated method stub
//		return BeerModel.builder().id(UUID.randomUUID()).beerName("Kingfisher").beerStyle(null).build();
//	}
//
//	@Override
//	public BeerModel saveNewBeer(BeerModel beerModel) {
//		// TODO Auto-generated method stub
//		log.debug("Posting a method....");
//		return BeerModel.builder().id(UUID.randomUUID()).build();
//	}

//	@Override
//	public void update(UUID beerId, BeerModel beerModel) {
//		// TODO Auto-generated method stub
//		// empty method
//
//	}
//
//	@Override
//	public void delete(UUID beerId) {
//		// TODO Auto-generated method stub
//		log.debug("Deleting a method...");
//
//	}

	@Override
	public void saveToRepo(BeerModel beerModel) {
		// TODO Auto-generated method stub

		repo.save(beerModel);

	}

	@Override
	public BeerModel findById(String documentID) {
		// TODO Auto-generated method stub
		return repo.findById(documentID).orElse(null);
		
	}

}
