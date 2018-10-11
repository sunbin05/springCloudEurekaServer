package com.cloud.test.eurekaserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaServer
@EnableZuulProxy
@SpringBootApplication
public class EurekaserverApplication {

	public static void main(String[] args) {
		//SpringApplication.run(EurekaserverApplication.class, args);
		new SpringApplicationBuilder(EurekaserverApplication.class).web(true).run(args);
	}
}
