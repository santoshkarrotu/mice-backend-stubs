package com.oyo.micebackend;


import com.oyo.aggregation.common.TCommonMetadataService;
import com.oyo.aggregation.mice.TFoodAggregationService;
import com.oyo.aggregation.mice.TMiceMetadataService;
import com.oyo.micebackend.service.*;
import com.oyo.aggregation.mice.TMiceAggregationService;
import com.oyo.search.TSearchService;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.Servlet;

@EnableAutoConfiguration
@ComponentScan("com.oyo.micebackend")
@SpringBootApplication
public class BackendStubsApplication {

	@Autowired
	MiceAggregationService miceAggregationService;
	@Autowired
	FoodAggregationService foodAggregationService;
	@Autowired
	SearchService searchService;
	@Autowired
	MetaDataFromAggregationService metaDataFromAggregationService;
	@Autowired
	CommonMetaDataService commonMetaDataService;

	public static void main(String[] args) { SpringApplication.run(BackendStubsApplication.class, args); }

	@Bean
	public Servlet food_aggregation() {
		TProcessor processor =
				new TFoodAggregationService.Processor<FoodAggregationService>(foodAggregationService);
		TProtocolFactory protoFactory = new TJSONProtocol.Factory();
		TServlet foodServlet = new TServlet(processor, protoFactory);
		return foodServlet;
	}

	@Bean
	public Servlet mice_aggregation() {
		TProcessor processor = new TMiceAggregationService.Processor<MiceAggregationService>(miceAggregationService);
		TProtocolFactory protoFactory = new TJSONProtocol.Factory();
		TServlet miceServlet = new TServlet(processor, protoFactory);
		return miceServlet;
	}

	@Bean
	public Servlet metadata_aggregation() {
		TProcessor processor = new TMiceMetadataService.Processor<MetaDataFromAggregationService>(metaDataFromAggregationService);
		TProtocolFactory protoFactory = new TJSONProtocol.Factory();
		TServlet metadataServlet = new TServlet(processor, protoFactory);
		return metadataServlet;
	}

	@Bean
	public Servlet search() {
		TProcessor processor =
				new TSearchService.Processor<SearchService>(searchService);
		TProtocolFactory protoFactory = new TJSONProtocol.Factory();
		Servlet searchServlet = new TServlet(processor, protoFactory);
		return searchServlet;
	}

	@Bean
	public Servlet common_aggregation() {
		TProcessor processor =
				new TCommonMetadataService.Processor<CommonMetaDataService>(commonMetaDataService);
		TProtocolFactory protocolFactory = new TJSONProtocol.Factory();
		Servlet citiesServlet = new TServlet(processor, protocolFactory);
		System.out.println("addsgadeRE");
		return citiesServlet;
	}
}
