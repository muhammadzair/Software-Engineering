package edu.qc.seclass;
import static edu.qc.seclass.BuggyClass.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BuggyClassTestSC2 {
	@Test
	public void bugTwoTestOneA() { 
		assertEquals(4, buggyMethod2(8,0));
	}
	
	@Test
	public void bugTwoTestTwoA() { 
		assertEquals(10, buggyMethod2(20,0));
	}
	
}
