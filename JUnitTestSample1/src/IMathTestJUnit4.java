import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IMathTestJUnit4 {
	private IMath tester;
	@Before /** Setup method executed before each test */
	public void setup() {    
		tester=new IMath();
	}
		
	@Test /** JUnit test methods to test isqrt. */
	public void testIsqrt1() {
		assertEquals("square root for 0 ", 0, tester.isqrt(0));       
	}
	@Test
	public void testIsqrt2() {
		assertEquals("square root for 1 ", 1, tester.isqrt(1));       
	}
	@Test
	public void testIsqrt3() {
		assertEquals("square root for 2 ", 1, tester.isqrt(2));
	}
	@Test
	public void testIsqrt4() {
	    assertEquals("square root for 100 ", 10, tester.isqrt(100));
	}
}
