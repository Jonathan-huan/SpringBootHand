package com.hzh.homework1;

import com.hzh.homework1.config.Example;
import com.hzh.homework1.domain.entity.Student;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.BiFunction;

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
		StudentTest studentTest = new StudentTest("hzh",20);//我new对象
		StudentTest studentTest1 = ((BiFunction<String, Integer, StudentTest>) StudentTest::new).apply("hzh", 20);//别人new对象
	}
	@Data
	@AllArgsConstructor
	 class StudentTest {
		private String name;
		private int age;
	 }
}
