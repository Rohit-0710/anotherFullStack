//package com.deloitte.model;
//
//import java.io.IOException;
//
//import com.fasterxml.jackson.core.JsonParser;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.DeserializationContext;
//import com.fasterxml.jackson.databind.JsonDeserializer;
//
//public class BeerModelStyle extends JsonDeserializer<BeerStyleEnum> {
//
//	@Override
//	public BeerStyleEnum deserialize(JsonParser p, DeserializationContext ctxt)
//			throws IOException, JsonProcessingException {
//		// TODO Auto-generated method stub
//		try {
//			return BeerStyleEnum.BearStyleContains(p.getText())
//		}
//		return null;
//	}
//
//}
//
//
