package com.deloitte.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;

@Configuration
public class MongoConfig {
	
	@Autowired
	private Environment env;
	
	private String dbName;
	
	@Bean
	public SimpleMongoClientDbFactory simpleMongoDbFactory()
	{
		return new SimpleMongoClientDbFactory("mongodb://localhost:27017/Beer?readPreference=primary&ssl=false");
	}
	
	@Bean
	public MongoTemplate mongoTemplate()
	{
		return new MongoTemplate(simpleMongoDbFactory());
	}
	

}
