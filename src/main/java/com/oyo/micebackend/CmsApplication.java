package com.oyo.micebackend;


import com.oyo.micebackend.service.MiceAggregator;
import com.oyo.aggregation.mice.TMiceAggregationService;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.Servlet;

@ComponentScan("com.oyo.micebackend")
@SpringBootApplication
public class CmsApplication {

	@Autowired
	MiceAggregator miceAggregator;

//	@Autowired
//	MetadataService.java metadataService;

	public static void main(String[] args) { SpringApplication.run(CmsApplication.class, args); }

	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		TProcessor processor =
				new TMiceAggregationService.Processor<>(miceAggregator);
		TProtocolFactory protoFactory = new TJSONProtocol.Factory();
		TServlet miceServlet = new TServlet(processor, protoFactory);
		return new ServletRegistrationBean(miceServlet, "/mice_aggregator/*");
	}

	@Bean
	public Servlet mice_aggregator() {
		TProcessor processor = new TMiceAggregationService.Processor<MiceAggregator>(miceAggregator);
		TProtocolFactory protocolFactory = new TJSONProtocol.Factory();
		TServlet miceServlet = new TServlet(processor, protocolFactory);
		return miceServlet;
	}
//	@Bean
//	public ServletRegistrationBean servletRegistrationBeanForMetadataService() {
//		TProcessor processor =
//				new TMetaDataService.Processor<>(metadataService);
//		TProtocolFactory protoFactory = new TJSONProtocol.Factory();
//		Servlet metadataServlet = new TServlet(processor, protoFactory);
//		return new ServletRegistrationBean(metadataServlet, "/metadata/*");
//	}
}
