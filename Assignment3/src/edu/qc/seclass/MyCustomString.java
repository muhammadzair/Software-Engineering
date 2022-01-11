package edu.qc.seclass;

import java.util.HashMap;

public class MyCustomString implements MyCustomStringInterface {
    private String myCustomString;

    public MyCustomString(){ 
        this.myCustomString = "";
    }

    @Override
    public String getString() {
        // Returns the custom String
        if(this.myCustomString == null){ 
            return null;
        }
        return this.myCustomString;
    }

    @Override
    public void setString(String string) {
        // Sets the custom string as the given input
        this.myCustomString = string;   
    }

    @Override
    public int countNumbers() {
        // Returns all digits in the string. Will throw a null pointer exception if the string is null
        if(this.myCustomString.equals(null)){ 
            throw new NullPointerException();
        }
        else{ 
            int res = 0;
            for(int i = 0; i < this.myCustomString.length(); i++){  
                boolean isDigit = Character.isDigit(this.myCustomString.charAt(i));
                boolean check = false; 
                if(i != 0) { 
                	check = Character.isDigit(this.myCustomString.charAt(i - 1));
                }
                if(isDigit && check == false){
                    res++;
                }
               
            }
            return res;
        }
    }

    @Override
    public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd) {
        // TODO Auto-generated method stub
    	if(this.myCustomString.equals(null) && n > 0){ 
            throw new NullPointerException();
        }
        if(n <= 0 ){ 
            throw new IllegalArgumentException(); 
        }
        if(this.myCustomString.length() == 0 || myCustomString.length() < n){ 
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if(startFromEnd == true){
            for(int i = myCustomString.length() - n; i >= 0; i -= n){ 
                sb.append(this.myCustomString.charAt(i)); 
            }
            sb.reverse(); 
            return sb.toString();
        } 
        else if(startFromEnd == false){ 
            for(int i = n - 1; i < this.myCustomString.length(); i += n){ 
                sb.append(this.myCustomString.charAt(i)); 
            }
        }
        return sb.toString();
    }

    @Override
    public void convertDigitsToNamesInSubstring(int startPosition, int endPosition) {
        // TODO Auto-generated method stub
        if(startPosition > endPosition){ 
            throw new IllegalArgumentException(); 
        }
        if(startPosition <= endPosition && startPosition < 1 || startPosition <= endPosition && endPosition < 1 || startPosition > this.myCustomString.length() || endPosition > this.myCustomString.length()){ 
            throw new MyIndexOutOfBoundsException();
        }
        if(startPosition <= endPosition && startPosition >= 0 && endPosition > 0 && myCustomString.equals(null)) { 
        	throw new NullPointerException();
        }
        char[] digits = {'0', '1', '2', '3', '4', '5','6', '7', '8', '9'}; 
        String [] digitsToString = {"Zero", "One", "Two", "Three", "Four", "Five" , "Six", "Seven", "Eight", "Nine"}; 
        HashMap<Character,String> digitMap= new HashMap<>();
        for(int i = 0 ; i < digits.length; i++){ 
            digitMap.put(digits[i], digitsToString[i]); 
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= startPosition -2; i++) { 
        	sb.append(this.myCustomString.charAt(i));
        }
        for(int i = startPosition - 1; i < endPosition; i++){
        	if(digitMap.containsKey(this.myCustomString.charAt(i))) { 
        		 String str = digitMap.get(this.myCustomString.charAt(i));
                 sb.append(str);
        	}
        	else { 
        		sb.append(this.myCustomString.charAt(i));
        	}
           
        }
        for(int i = endPosition; i < this.myCustomString.length(); i++) { 
        	sb.append(this.myCustomString.charAt(i));
        }
        setString(sb.toString());  
    }
}
