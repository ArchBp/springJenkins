package hg.demos.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sun.tools.javac.util.Assert;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		Boolean toTest = false;
		assert toTest == false;
	}

}
