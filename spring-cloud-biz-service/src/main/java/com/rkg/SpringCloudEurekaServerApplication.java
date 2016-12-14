package com.rkg;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudEurekaServerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringCloudEurekaServerApplication.class).web(true).run(args);
	}
}
