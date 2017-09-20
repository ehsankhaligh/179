import static org.junit.Assert.*;

import org.junit.Test;

public class IMathTestJUnit3 {

	@Test
	public void testIsqrt() {
		IMath tester = new IMath();
		assertEquals("square root for 0 ", 0, tester.isqrt(0));
		assertEquals("square root for 1 ", 1, tester.isqrt(1));
		assertEquals("square root for 2 ", 1, tester.isqrt(2));
		assertEquals("square root for 3 ", 1, tester.isqrt(3));
		assertEquals("square root for 100 ", 10, tester.isqrt(100));
		}
}
