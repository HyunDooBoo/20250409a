package edu.fisa.ce;
import static org.junit.Assert.assertEquals; // JUnit 4
// 또는
import static org.junit.jupiter.api.Assertions.assertEquals; // JUnit 5

public class CalculatorTest {
	@org.junit.Test // JUnit 4
	// @org.junit.jupiter.api.Test // JUnit 5
	public void testAddition() {
		int result = 2 + 3;
		assertEquals(5, result); // 성공: 5 == 5
	}
}