package edu.qc.seclass;

public class BuggyClass {
	
	//First method
	public static int buggyMethod1(int first, int second){
		if(second == 0) { 
			if(first % 2 == 0) {
				System.out.println("Numerator is even, too bad");
				return first / second;
			}
			else { 
				System.out.println("Numerator is odd");
				if(first % 5 == 0 ) {
					return first / second;
				}
				second = 1; 
				return first / second;
			}
		}
		System.out.println("No issues?");
		return first / second;
		
	}
	
	//Second method
	public static int buggyMethod2(int first, int second) { 
		if(second == 0) { 
			second += 2;
//			int copy = second; 
//			second = first; 
//			first = copy;
		}
		System.out.println("Wow what will happen?");
		return first / second;
	}
	
	//Third method
	public static int buggyMethod3(int first, int second) { 
		int num = 10; 
		if(first == 10 ) { 
			System.out.println("It's 10");
			num += 10;
		}
		else if(first > 10){ 
			System.out.println("It's greater than 10");
			num += 20;
		}
		return num / second; 
		
	}
	
	//Fourth method
	public static void buggyMethod4(int first, int second) { 
//		This method is not possible because if the coverage for the branch both does not show the fault 
//		and has 100% branch coverage, then we can never show the fault because the fault is 
//		100% hidden. 
//		
	}
	
	//Fifth method
	public static void buggyMethod5(int i) { 
//		1. public void buggyMethod5 (int i) {
//			2. int x;
//			3. [point where you can add code]
//			4. x = i/0;
//			5. [point where you can add code]
//			6. }
//		This method is not possible because we're given zero as the denominator on number 4.
//		There is no way to divide by zero and still have it hide the fault. We are also not 
//		allowed to use any exceptions, we're stuck with the divide by zero.
	}
}
