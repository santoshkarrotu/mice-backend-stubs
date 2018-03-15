package com.example.cms;

//import com.example.cms.service.MetadataService;
import com.example.cms.service.MiceAggregator;
import com.oyo.aggregation.mice.TMiceAggregationService;
import com.oyo.metadata.TMetaDataService;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.Servlet;

@SpringBootApplication
public class CmsApplication {

	@Autowired
	MiceAggregator miceAggregator;

//	@Autowired
//	MetadataService metadataService;

	public static void main(String[] args) { SpringApplication.run(CmsApplication.class, args); }

	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		TProcessor processor =
				new TMiceAggregationService.Processor<>(miceAggregator);
		TProtocolFactory protoFactory = new TJSONProtocol.Factory();
		Servlet miceServlet = new TServlet(processor, protoFactory);
		return new ServletRegistrationBean(miceServlet, "/miceAggregator/*");
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
