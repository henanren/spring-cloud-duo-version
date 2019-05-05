package com.laomn.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import cn.springcloud.gray.client.EnableGrayClient;

@EnableZuulProxy
@SpringBootApplication
@EnableGrayClient
@EnableDiscoveryClient
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

	// @Bean
	// public AccessUserNameFilter accessUserNameFilter() {
	// return new AccessUserNameFilter();
	// }
	//
	// @Bean
	// public AccessPasswordFilter accessPasswordFilter() {
	// return new AccessPasswordFilter();
	// }
	//
	// @Bean
	// public AccessTokenFilter accessTokenFilter() {
	// return new AccessTokenFilter();
	// }

}
