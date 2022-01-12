package edu.qc.seclass;
import static edu.qc.seclass.BuggyClass.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BuggyClassTestSC3 {
	@Test
	public void bugThreeTestOneB() { 
		assertEquals(1, buggyMethod3(10, 20));
	}
	
	@Test
	public void bugThreeTestTwoB() { 
		assertEquals(1, buggyMethod3(20,30));
	}
	
	@Test
	public void bugThreeTestThreeB() { 
		assertEquals(1, buggyMethod3(9,0));
	}
}
