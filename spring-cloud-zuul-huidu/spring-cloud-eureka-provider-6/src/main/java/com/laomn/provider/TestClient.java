package com.laomn.provider;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by saleson on 2017/11/10.
 */
@FeignClient(name = "eureka-provider")
public interface TestClient {

	@RequestMapping(path = "/api/test/get", method = RequestMethod.GET)
	Map<String, String> testGet(@RequestParam(value = "version", required = false) String version);

}
