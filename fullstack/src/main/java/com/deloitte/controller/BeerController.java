package com.deloitte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.model.BeerModel;
import com.deloitte.services.BeerService;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

	@Autowired
	BeerService beerService;

//
//	public BeerController(BeerService beerService) {
//		super();
//		this.beerService = beerService;
//	}

//
//	@GetMapping({"/{beerId}"})
//	public ResponseEntity<BeerModel> getBeer(@PathVariable("beerId")  UUID beerId) {
//		return new ResponseEntity<>(beerService.getBeerByID(beerId), HttpStatus.OK);
//		
//	}

	/*
	 * @PostMapping public ResponseEntity handlePost(@RequestBody BeerModel
	 * beerModel) { BeerModel dto = beerService.saveNewBeer(beerModel); HttpHeaders
	 * httpHeaders = new HttpHeaders(); httpHeaders.add("Location", "/api/v1/beer/"
	 * + dto.getId().toString());
	 * 
	 * return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
	 * 
	 * }
	 * 
	 * @PutMapping({"/{beerId}"}) public ResponseEntity
	 * handleUpdate(@PathVariable("beerId") UUID beerId, @RequestBody BeerModel
	 * beerModel) { beerService.update(beerId, beerModel); return new
	 * ResponseEntity(HttpStatus.NO_CONTENT);
	 * 
	 * }
	 */

//	@DeleteMapping({"/{beerId}"})
//	public void handleDelete(@PathVariable("beerId") UUID beerId) {
//		beerService.delete(beerId);
//	}

	@PostMapping("/save")
	public void saveToRepo(@RequestBody BeerModel beerModel) {
		beerService.saveToRepo(beerModel);

	}

	@GetMapping("/search")
	public ResponseEntity<BeerModel> getInfoByObjectId(@RequestParam String documentID) {
		if (beerService.findById(documentID) != null)
			return new ResponseEntity<>(beerService.findById(documentID), HttpStatus.OK);

		return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
	}

}
