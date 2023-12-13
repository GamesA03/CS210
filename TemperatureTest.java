package week7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {
	Temperature converter = new Temperature();
	double testTemp1 = converter.toFahrenheit(15);
	double resultTemp1 = 59;
	@Test
	public void testToFahrenheitDouble() {
		assertEquals(testTemp1, resultTemp1);
	}



}
