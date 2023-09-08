package com.hzh.homework1;

import com.hzh.homework1.config.Example;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class Homework1ApplicationTests {
	@Autowired
	private Example example;

	@Test
	void contextLoads() {
		Assertions.assertEquals("Demo", example.getName());
		Assertions.assertEquals("Demo project", example.getDescription());
		Assertions.assertEquals("1.0.0", example.getVersion());
		log.info("name: {}", example.getName());
	}

}
