package com.project.staragile.orthopedician;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrthopedicianApplicationTests {

	@Autowired
	DoctorService doctorService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void testService() {
	  assertEquals(doctorService.sayHello(), "Hello from Doctor Shubham");
	}
}
