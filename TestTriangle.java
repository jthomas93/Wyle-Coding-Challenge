package testshape;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import shape.*;

public class TestTriangle {
	
	public static Triangle testTri;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		double h = 8;
		double a = 3;
		double b = 4;
		double c = 5;
		
		testTri = new Triangle(h, b, a, c);
	}
	
	@Test
	public void testGetArea() {
		double ar = testTri.getArea();
		
		double arexp = (8 * 4) / 2;
		assertEquals(ar, arexp, 0);
	}
	
	@Test
	public void testGetAreaNonZero() {
		double ar = testTri.getArea();
		boolean nonzero = false;
		
		if(ar != 0) {
			nonzero = true;
		}
		
		assertTrue(nonzero);
		
	}
	
	@Test
	public void testGetAreaNonNeg() {
		double ar = testTri.getArea();
		boolean nonneg = false;
		
		if(ar > 0) {
			nonneg = true;
		}
		assertTrue(nonneg);
		
	}
	
	@Test
	public void testGetPerimeter() {
		double perexp = 3 + 4 + 5;
		double per = testTri.getPerimeter();
		assertEquals(perexp, per, 0);
	}
	
	@Test
	public void testGetPerimeterNonZero() {
		double per = testTri.getPerimeter();
		
		boolean nonzero = false;
		
		if(per != 0) {
			nonzero = true;
		}
		
		assertTrue(nonzero);
		
	}
	
	@Test
	public void testGetPerimeterNonNeg() {
		double per = testTri.getPerimeter();
		boolean nonneg = false;
		
		if(per > 0) {
			nonneg = true;
		}
		assertTrue(nonneg);
	}
		
	  
	

	@After
	public void tearDown() throws Exception {
		testTri = null;
	}

	

}
