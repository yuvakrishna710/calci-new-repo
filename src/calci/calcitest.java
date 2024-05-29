package calci;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calcitest {
	@Test
	public void calTest() {
		assertEquals(30, calculator.add(10, 20));
	}
	@Test
	public void calTestSub() {
		assertEquals(30, calculator.sub(50, 20));
	}
	@Test 
	public void calTestMul() {
		assertEquals(30, calculator.mul(5,6));
	}
	@Test
	public void calTestDiv() {
		assertEquals(6,calculator.div(30, 5));
	}
	}
	

