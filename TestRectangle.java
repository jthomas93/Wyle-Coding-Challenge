package testshape;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import shape.*;


public class TestRectangle {
	
	public static Rectangle testRect;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		double len = 10;
		double wid = 10;
		
	     testRect = new Rectangle(len, wid);
	
	}
	
	@Test
	public void testGetArea() {
		double arexp = 100;
		double ar = testRect.getArea();
		
		assertEquals(ar, arexp, 0);
		
	}
	
	@Test
	
	public void testGetAreaNotZero () {
		double  ar = testRect.getArea();
		boolean nonzero = false;
		
		if(ar != 0) {
			nonzero = true;
		}
		
		assertTrue(nonzero);
		
	}
	
	@Test
	public void testGetAreaNonNeg() {
		double ar = testRect.getArea();
		boolean nonneg = false;
		
		if(ar > 0) {
			nonneg = true;
		}
		assertTrue(nonneg);
		
   }
	
   @Test
   public void testGetPerimeter() {
	   double pexp = 40;
	   double per = testRect.getPerimeter();
	   
	   assertEquals(per, pexp, 0);
   }
   
   @Test
   public void testGetPerimeterNonZero() {
	   double per = testRect.getPerimeter();
	   boolean nonzero = false;
	   
	   if(per != 0) {
		   nonzero = true;
	   }
	   
	   assertTrue(nonzero);
	   
  }
   
  @Test
  public void testGetPeimeterNonNeg() {
	  double per = testRect.getPerimeter();
	  boolean nonneg = false;
	  
	  if(per > 0) {
		  nonneg = true;
	  }
	  assertTrue(nonneg);
	  
	  
  }
   
	

	



	
	

	@After
	public void tearDown() throws Exception {
		testRect = null;
	}

	

}
