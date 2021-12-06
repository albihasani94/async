package com.albi.async;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.get;

@SpringBootTest
class AsyncApplicationTests {

	@Test
	public void testProcess() {
		get("/rest/process").then().assertThat().statusCode(400);
	}

	@Test
	public void testAsyncProcess() {
		get("/rest/processAsync").then().assertThat().statusCode(400);
	}

}
