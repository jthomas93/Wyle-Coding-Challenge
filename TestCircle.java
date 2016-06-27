package testshape;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import shape.*;
public class TestCircle {
	
	public static Circle testCircle;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		testCircle = new Circle(16);
	}

	@Test
	public void testGetAreaValidCalc() {
		double areaexp = testCircle.getArea();
		
		double arr = (16) * (16) *(Math.PI);
		
		assertEquals(areaexp, arr, 0.4);
	
	}
	
	@Test
	public void testGetAreaNotZero() {
		double areaexp = testCircle.getArea();
		boolean cond = false;
		
		if(areaexp != 0.0) {
			cond = true;
		}
		assertTrue(cond);
		
	}
	
	
	@Test
	public void testGetAreaNotNeg() {
		double arr = testCircle.getArea();
	    boolean notneg = false;
	    
	    if(arr > 0) {
	    	notneg = true;
	    	
	    }
	    
	    assertTrue(notneg);
	}
	
	
	@Test
	public void testGetPerimeter() {
		double perimexp = (2) * (Math.PI) *(16);
		double perimcalc = testCircle.getPerimeter();
		
		assertEquals(perimexp, perimcalc, 0.4);
		

		
	}
	
	
	@Test
	public void testGetPerimeterNotZero() {
		double ret = testCircle.getPerimeter();
		boolean nonzero = false;
		
		if(ret != 0.0) {
			nonzero = true;
		}
		
		assertTrue(nonzero);
	}
	
	@Test
	public void testGetPerimeterNonNeg() {
		double pexp = testCircle.getPerimeter();
		boolean nonneg = false;
		
		if(pexp > 0.0)  {
			nonneg = true;
		}
		
		assertTrue(nonneg);
	}
	
	@After
	public void tearDown() throws Exception {
		testCircle = null;
	}
	
		
	}
		
	
    
    





