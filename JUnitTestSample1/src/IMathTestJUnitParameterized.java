import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class IMathTestJUnitParameterized {
	private IMath tester;        
	private int input;        
	private int expectedOutput;       
	/** Constructor method to accept each input-output pair*/
	public IMathTestJUnitParameterized(int input, int expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
		}
	@Before
	/** Set up method to create the test fixture */
	public void initialize() {
		tester = new IMath(); 
	}
	@Parameterized.Parameters
	/** Store input-output pairs, i.e., the test data */
	public static Collection<Object[]> valuePairs() {
		return Arrays.asList(new Object[][] { { 0, 0 }, { 1, 1 }, { 2, 1 }, { 1, 1 }, { 100, 10 } });
	}
	@Test/** Parameterized JUnit test method*/
	public void testIsqrt() {
		assertEquals("square root for " + input + " ", expectedOutput, tester.isqrt(input));
		}
	} 