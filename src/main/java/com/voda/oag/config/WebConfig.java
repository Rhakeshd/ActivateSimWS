package com.voda.oag.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;



@Configuration
@ComponentScan({ "com.voda" })
public class WebConfig  {
	
	 @Value("${mongo.connection.string}")
	    private String connectionString;
	    
	    @Value("${mongo.db.name}")
	    private String dbName;
	    
	        
	    @Bean
	    public com.mongodb.client.MongoClient mongoClient()
	    {
	         //return MongoClients.create("mongodb://localhost:27017");
	        return MongoClients.create(connectionString);
	    }

	    public @Bean MongoTemplate mongoTemplate() {
	        //return new MongoTemplate(mongoClient(), "activateSimDB");
	        return new MongoTemplate(mongoClient(), dbName);
	    }
}
