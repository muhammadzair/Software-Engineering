package edu.qc.seclass;
import static edu.qc.seclass.BuggyClass.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BuggyClassTestSC1a {
	@Test
	 public void bugOneTestOneA() { 
		assertEquals(3, buggyMethod1(3,0));
	}
	
	@Test 
	public void bugOneTestTwoA() { 
		assertEquals(501, buggyMethod1(501,0));
	}
}
