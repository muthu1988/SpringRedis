package com.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="redis")
public class SampleController {
	
	@Autowired
	StringRedisTemplate template;
	
	@GetMapping
	private String getvalue(@RequestParam String param) {
		return template.boundValueOps(param).get();
	}
	
	@PostMapping
	private String postValue(@RequestBody RedisRequest redisRequest){
		template.opsForValue().append(redisRequest.getKey(), redisRequest.getValue());
		return template.boundValueOps(redisRequest.getKey()).get();
	}

}
