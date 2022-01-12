package edu.qc.seclass;
import static edu.qc.seclass.BuggyClass.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BuggyClassTestBC3 {
	@Test
	public void bugThreeTestOneA() { 
		assertEquals(1, buggyMethod3(10, 20));
	}
	
	@Test
	public void bugThreeTestTwoA() { 
		assertEquals(1, buggyMethod3(20,30));
	}
}
