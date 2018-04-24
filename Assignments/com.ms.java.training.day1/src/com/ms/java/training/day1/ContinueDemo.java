package com.ms.java.training.day1;

public class ContinueDemo {
	
	public static void main(String[] args) {

        String searchMe = "Peter PiPer Picked a " + "Peck of Pickled PePPers";
        
        int max = searchMe.length();
        int numPs = 0;
        System.out.println("length of String "+max);
        
        for (int i = 0; i < max; i++) {
	            // interested only in p's
	            if (searchMe.charAt(i) != 'P')
	            {
	            	continue;
	            }

            numPs++;
        }
        System.out.println("Found " + numPs + " P's in the string.");
    }

}
