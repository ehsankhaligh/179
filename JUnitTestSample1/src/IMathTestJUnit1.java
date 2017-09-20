import org.junit.Test;
import static org.junit.Assert.*;
public class IMathTestJUnit1 {
	/** A JUnit test method to test isqrt. */
	@Test
	public 	void testIsqrt() {
		IMath tester = new IMath();
		assertTrue(0 == tester.isqrt(0));
		assertTrue(1 == tester.isqrt(1));
		assertTrue(1 == tester.isqrt(2));
		assertTrue(1 == tester.isqrt(3));
		assertTrue(10 == tester.isqrt(100));
		}
/** Other JUnit test methods**/
}