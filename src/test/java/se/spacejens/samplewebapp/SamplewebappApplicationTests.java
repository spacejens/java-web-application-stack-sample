package se.spacejens.samplewebapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SamplewebappApplicationTests {

	@Autowired
	HelloWorldController helloWorldController;

	@Test
	void contextLoads() {
		/*
		 * The purpose of this test case is to verify that the context loads successfully (i.e. no exception is thrown).
		 * Therefore, no additional code is needed in this test case.
		 */
	}

	@Test
	void componentInjectionWorks() {
		assertNotNull(helloWorldController);
	}
}
