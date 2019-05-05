package com.laomn.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.springcloud.gray.client.EnableGrayClient;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableGrayClient
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaProviderApplication6 {

	@Value("${server.port}")
	String port;

	@RequestMapping("/")
	public String home() {
		String str = "Hello world ,port:" + port;
		System.out.println(str);
		return str;
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderApplication6.class, args);
	}

}
