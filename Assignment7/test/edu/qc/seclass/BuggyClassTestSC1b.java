package edu.qc.seclass;
import static edu.qc.seclass.BuggyClass.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BuggyClassTestSC1b {

	public void bugOneTestOneB() { 
		assertEquals(5, buggyMethod1(5,0));
	}
	
	@Test 
	public void bugOneTestTwoB() { 
		assertEquals(2, buggyMethod1(2,0));
	}
	   
}
