package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {
        mycustomstring = null;
    }

    @Test
    //Checks to see if digits next to each other will count as one number
    public void testCountNumbers1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }

    @Test (expected = NullPointerException.class)
    //Checks to see if null pointer exception will be thrown if string is null
    public void testCountNumbers2() {
    	mycustomstring.setString(null);
    	mycustomstring.countNumbers();
    }

    @Test
    //Checks to see if program recognizes negative numbers
    public void testCountNumbers3() {
    	mycustomstring.setString("Lets try negative numbers like -1 and -100");
    	assertEquals(2, mycustomstring.countNumbers());
    }

    @Test
    public void testCountNumbers4() {
    //Checks to see if program recognizes a string thats a number as one number
    	mycustomstring.setString("123456789");
    	assertEquals(1, mycustomstring.countNumbers());   	
    }

    @Test
    public void testCountNumbers5() {
    //Checks to see if program recognizes an empty string
    	mycustomstring.setString("");
    	assertEquals(0, mycustomstring.countNumbers());
    }

    @Test
    public void testCountNumbers6() {
    //Checks to see if program recognizes that a string has no digits
    	mycustomstring.setString("This string has no digits!");
    	assertEquals(0, mycustomstring.countNumbers());
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
    	//Checks to see if the program can start at the start
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
    	//Checks to see if the program can start at the end
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    @Test (expected = NullPointerException.class)
    //Checks to see if we can handle a null string
    public void testGetEveryNthCharacterFromBeginningOrEnd3() {
    	mycustomstring.setString(null);
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, true);
    }

    @Test (expected = IllegalArgumentException.class)
    //Will throw an illegal argument exception if n is 0
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
    	mycustomstring.setString("Check if n is valid");
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, false);
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
    	//Checks to see if we return an empty string if we have an empty string
    	mycustomstring.setString("");
    	assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
    	//Checks to see if we get an empty string if our n is greater than the length of the string
    	mycustomstring.setString("Short");
    	assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(7, false));
    }

    @Test (expected = IllegalArgumentException.class)
    //Checks to see if N is negative
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
    	mycustomstring.setString("Negative N");
    	mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-10, false);
    }

    @Test
    //checks to see if we get the same string we're given if we're going up by one in reverse
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
    	mycustomstring.setString("Same as before");
    	assertEquals("Same as before", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, true));
    }

    @Test
   //checks to see if we get the same string we're given if we're going up by one in order
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
    	mycustomstring.setString("Same as before");
    	assertEquals("Same as before", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
    	//checks to see if we get all multiples of 3 in order
    	mycustomstring.setString(" 1 2 3 4 5 6 7 8 9 ");
    	assertEquals(" 3 6 9", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    //checks to see if we get all multiples of 2
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
    	mycustomstring.setString("123456789");
    	assertEquals("2468", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }

    @Test
    //Checks to make a pattern
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
    	mycustomstring.setString("::)O");
    	assertEquals(":)", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
    	//Checks to see if extra space still gives us a blank string
    	mycustomstring.setString("  ");
    	assertEquals("  ", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
    	mycustomstring.setString("H1I2D3E4I5N6C7O8D9E0");
    	assertEquals("HIDEINCODE", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }

    @Test
    //Checks to see if numbers and digits can be combined
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }

    @Test (expected = IllegalArgumentException.class)
    //Checks to see if the start position is greater than the end position 
    public void testConvertDigitsToNamesInSubstring2() {
        mycustomstring.setString("Is start greater than end?"); 
        mycustomstring.convertDigitsToNamesInSubstring(5, 2);
    }

    @Test (expected = MyIndexOutOfBoundsException.class)
    //Checks to see if the end position is greater than the length of the string
    public void testConvertDigitsToNamesInSubstring3() {
        mycustomstring.setString("Can end be greater than length of the string?"); 
        mycustomstring.convertDigitsToNamesInSubstring(1, 200);
    }

    @Test (expected = MyIndexOutOfBoundsException.class)
    //Checks to see if the start position is less than 0
    public void testConvertDigitsToNamesInSubstring4() {
    	mycustomstring.setString("Can start be less than 0?"); 
        mycustomstring.convertDigitsToNamesInSubstring(-5, 10);
    }

    @Test (expected = NullPointerException.class)
    //Checks to see if the string is null
    public void testConvertDigitsToNamesInSubstring5() {
    	mycustomstring.setString(null); 
        mycustomstring.convertDigitsToNamesInSubstring(3, 5);
    }

    @Test
    public void testConvertDigitsToNamesInSubstring6() {
    	//Checks to see if the digits at the end will be converted
    	mycustomstring.setString("I'm 4 R0ckst4r, I cou1d've j0in3d Slay3r");
    	mycustomstring.convertDigitsToNamesInSubstring(35, 40);
    	assertEquals("I'm 4 R0ckst4r, I cou1d've j0in3d SlayThreer", mycustomstring.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring7() {
    	//Checks to see if the output will be correct when we're going through the whole string to translate digits
    	mycustomstring.setString("02-02-1999");
    	mycustomstring.convertDigitsToNamesInSubstring(1, 10);
    	assertEquals("ZeroTwo-ZeroTwo-OneNineNineNine", mycustomstring.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring8() {
    //Checks to see if the output will be correct when we're going through an entire string with no digits
    	mycustomstring.setString("This is a sentence with no digits.");
    	mycustomstring.convertDigitsToNamesInSubstring(1, 34);
    	assertEquals("This is a sentence with no digits.", mycustomstring.getString());
    }

}
