package com.ms.java.training.day1;

import java.io.IOException;
import java.util.StringTokenizer;

public class EqualsVsEqualTo {
	
	public static void main(String...aArguments) throws IOException {

	    String usuario = "Jorman";
	    //String password = "14988611";

	    String strDatos = "Jorman 14988611";
	    
	    StringTokenizer tokens = new StringTokenizer(strDatos, " ");
	    

	    int nDatos = tokens.countTokens();
	    
	    System.out.println (nDatos);
	   
	    String[] datos = new String[nDatos];
	    
	    int i = 0;

	    while (tokens.hasMoreTokens()) {
	        String str = tokens.nextToken();
	        datos[i] = str;
	        i++;
	    }

	    System.out.println ("usuario : " +usuario+ " and datos[i]:  "+datos[0]);

	    if ((datos[0] == usuario)) {
	        System.out.println("== WORKING");
	    }
	    else if ((datos[0].equals(usuario))) {
	        System.out.println("equals WORKING");
	    }
	    	    
	    
	    String personalLoan = new String("cheap personal loans");
	    String homeLoan = new String("cheap personal loans");
	          
	    //since two strings are different object result should be false
	    boolean result = personalLoan == homeLoan;
	    System.out.println("Comparing two strings with == operator: " + result);
	          
	    //since strings contains same content , equals() should return true
	    result = personalLoan.equals(homeLoan);
	    System.out.println("Comparing two Strings with same content using equals method: " + result);
	          
	    homeLoan = personalLoan;
	    //since both homeLoan and personalLoand reference variable are pointing to same object
	    //"==" should return true
	    result = (personalLoan == homeLoan);
	    System.out.println("Comparing two reference pointing to same String with == operator: " + result);

	   
	    
/*	    String personalLoan1 = "cheap personal loans";
	    String homeLoan1 = "cheap personal loans";
	          
	    //since two strings are different object result should be false
	    boolean result1 = personalLoan1 == homeLoan1;
	    System.out.println("Comparing two strings with == operator: " + result);
	          
	    //since strings contains same content , equals() should return true
	    result = personalLoan1.equals(homeLoan1);
	    System.out.println("Comparing two Strings with same content using equals method: " + result);
	          
	    homeLoan1 = personalLoan1;
	    //since both homeLoan and personalLoand reference variable are pointing to same object
	    //"==" should return true
	    result = (personalLoan1 == homeLoan1);
	    System.out.println("Comparing two reference pointing to same String with == operator: " + result);
*/	    
	    
	    int k=5;
	    int j=6;
	    
	    if(k==j)
	    {
	    	System.out.println(true);
	    }else{
	    	System.out.println(false);
	    }
	    //else if(k.equ)
	    
	    
	}

}
