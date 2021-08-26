package com.zbo.cloud.condor;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CondorApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void helloWorldTests(){
		HelloController controller = new HelloController();
		String result = controller.hello("bob");
		TestCase.assertEquals(result,"Hello bob!");

	}

}
