import static org.junit.Assert.*;

import org.junit.Test;

public class IMathTestJUnit2 {

	@Test
	public void testIsqrt() {
		IMath tester = new IMath();
		assertEquals(0, tester.isqrt(0));
		assertEquals(1, tester.isqrt(1));
		assertEquals(1, tester.isqrt(2));
		assertEquals(1, tester.isqrt(3));
		assertEquals(10, tester.isqrt(100));
	}
}
