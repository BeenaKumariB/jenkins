package com.example.ZuulGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.ZuulGateway.filters.*;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayApplication.class, args);
	}
	
	@Bean
    public PreFilter preFilter1() {
    	System.out.println("PreFilter");
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter1() {
    	System.out.println("PostFilter");
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter1() {
    	System.out.println("ErrorFilter");
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter1() {
    	System.out.println("RouteFilter");
        return new RouteFilter();
    }
}
