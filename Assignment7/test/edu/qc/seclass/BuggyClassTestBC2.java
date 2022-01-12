package edu.qc.seclass;
import static edu.qc.seclass.BuggyClass.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BuggyClassTestBC2 {
	@Test
	public void bugTwoTestOneA() { 
		assertEquals(3, buggyMethod2(6,0));
	}
	
	@Test
	public void bugTwoTestTwoA() { 
		assertEquals(50, buggyMethod2(100,0));
	}
}
