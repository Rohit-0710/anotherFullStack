package com.deloitte.model;

import java.util.stream.Stream;

public enum BeerStyleEnum {

	LAGER, PILSNER, STOUT, GOSE, PORTER, ALE, WHEAT, IPA, PALE_ALE, SAISON;

	public static String BearStyleContains(String beerStyle) {
		if (Stream.of(BeerStyleEnum.values()).anyMatch(x -> x.toString().equals(beerStyle))) {
			return beerStyle;
		}

		return LAGER.toString();
	}

}