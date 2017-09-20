import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;


public class testMyTriangle { 
	Triangle myTriangle;
	
	@Before 
	/** Setup method executed before each test */ 
	public void setup() { 
		myTriangle = new Triangle(10, 10, 10);
	}

	@Test 
	public void testClassify1() { 
		assertEquals(myTriangle.classify(), "equilateral"); 
	}

	@Test 
	public void testClassify2() { 
		Triangle myTriangle = new Triangle(180,45,45);
		assertEquals(myTriangle.classify(), "isosceles"); 
	}
	
	@Test 
	public void testClassify3() { 
		Triangle myTriangle = new Triangle(3,4,5);
		assertEquals(myTriangle.classify(), "right-angled"); 
	}
	
	@Test 
	public void testClassify4() { 
		Triangle myTriangle = new Triangle(10,20,29);
		assertEquals(myTriangle.classify(), "scalene"); 
	}
	
	@Test 
	public void testClassify5() { 
		Triangle myTriangle = new Triangle(0,0,0);
		assertEquals(myTriangle.classify(), "impossible"); 
	}
	
	@Test 
	public void testClassify6() { 
		Triangle myTriangle = new Triangle(-1,-1,-1);
		assertEquals(myTriangle.classify(), "impossible"); 
	}
	
	@Test 
	public void testArea1() { 
		Triangle myTriangle = new Triangle(3,4,5);
		assertEquals(6, myTriangle.getArea(), 0.00001); 
	}
	
	@Test 
	public void testArea2() { 
		Triangle myTriangle = new Triangle(10,24,26);
		assertEquals(120, myTriangle.getArea(), 0.00001); 
	}
	
	@Test 
	public void testArea3() { 
		Triangle myTriangle = new Triangle(-3,-4,-5);
		assertEquals(-6, myTriangle.getArea(), 0.00001); 
	}
	
	
	
	@Test 
	public void testPerimeter1() { 
		Triangle myTriangle = new Triangle(3,4,5);
		assertEquals(12, myTriangle.getPerimeter()); 
	}
	
	@Test 
	public void testPerimeter2() { 
		Triangle myTriangle = new Triangle(11,12,12);
		assertEquals(35, myTriangle.getPerimeter()); 
	}
	
	@Test 
	public void testPerimeter3() { 
		Triangle myTriangle = new Triangle(-3,-4,-5);
		assertEquals(-12, myTriangle.getPerimeter()); 
	}
	
	@Test 
	public void testConstructor1() { 
		Triangle myTriangle = new Triangle(-3,-4,-5);
		assertEquals("-3,-4,-5", myTriangle.getSideLengths()); 
	}
	
	@Test 
	public void testSetAndGet1() { 
		Triangle myTriangle = new Triangle(3,4,5);
		myTriangle.setSideLengths(4, 5, 6);
		assertEquals("4,5,6", myTriangle.getSideLengths()); 
	}
	
	@Test 
	public void testSetAndGet2() { 
		Triangle myTriangle = new Triangle(3,4,5);
		myTriangle.setSideLengths(11, 12, 13);
		assertEquals("11,12,13", myTriangle.getSideLengths()); 
	}
	
	@Test 
	public void testSetAndGet3() { 
		Triangle myTriangle = new Triangle(3,4,5);
		myTriangle.setSideLengths(-11, -12, -13);
		assertEquals("-11,-12,-13", myTriangle.getSideLengths()); 
	}
	
	@Test 
	public void testIsEquilateral1() { 
		Triangle myTriangle = new Triangle(5,5,5);
		assertEquals(true , myTriangle.isEquilateral()); 
	}
	
	@Test 
	public void testIsEquilateral2() { 
		Triangle myTriangle = new Triangle(4,5,5);
		assertEquals(false , myTriangle.isEquilateral()); 
	}
	
	@Test 
	public void testIsEquilateral3() { 
		Triangle myTriangle = new Triangle(-5,-5,-5);
		assertEquals(true , myTriangle.isEquilateral()); 
	}
	
	@Test 
	public void testIsImpossible() { 
		Triangle myTriangle = new Triangle(-5,-5,-5);
		assertEquals(true , myTriangle.isImpossible()); 
	}
	
	@Test 
	public void testIsImpossible1() { 
		Triangle myTriangle = new Triangle(-5,-5,-5);
		assertEquals(false , myTriangle.isImpossible()); 
	}
	
	@Test 
	public void testIsImpossible2() { 
		Triangle myTriangle = new Triangle(0,0,0);
		assertEquals(true , myTriangle.isImpossible()); 
	}
	
	@Test 
	public void testisIsosceles1() { 
		Triangle myTriangle = new Triangle(10,10,0);
		assertEquals(true , myTriangle.isIsosceles()); 
	}
	
	
	@Test 
	public void testisIsosceles2() { 
		Triangle myTriangle = new Triangle(10,10,19);
		assertEquals(true , myTriangle.isIsosceles()); 
	}
	
	
	@Test 
	public void testisIsosceles3() { 
		Triangle myTriangle = new Triangle(-1,-1,-19);
		assertEquals(true , myTriangle.isIsosceles()); 
	}
	
	@Test 
	public void testisIsosceles4() { 
		Triangle myTriangle = new Triangle(-3,-1,-19);
		assertEquals(true , myTriangle.isIsosceles()); 
	}
	
	
	 
	@Test 
	public void testisRightAngled1() { 
		Triangle myTriangle = new Triangle(3,4,5);
		assertEquals(true , myTriangle.isRightAngled()); 
	}
	
	@Test 
	public void testisRightAngled2() { 
		Triangle myTriangle = new Triangle(1,1,5);
		assertEquals(false , myTriangle.isRightAngled()); 
	}
	
	@Test 
	public void testisRightAngled3() { 
		Triangle myTriangle = new Triangle(-3,-4,-5);
		assertEquals(false , myTriangle.isRightAngled()); 
	}
	
	 
	
	@Test 
	public void testisScalene(){ 
		Triangle myTriangle = new Triangle(3,4,5);
		assertEquals(false , myTriangle.isScalene()); 
	}
	
	
	@Test 
	public void testisScalene1(){ 
		Triangle myTriangle = new Triangle(1,4,5);
		assertEquals(true , myTriangle.isScalene()); 
	}
	
	@Test 
	public void testisScalene2(){ 
		Triangle myTriangle = new Triangle(-1,-4,-5);
		assertEquals(false , myTriangle.isScalene()); 
	}	
}


