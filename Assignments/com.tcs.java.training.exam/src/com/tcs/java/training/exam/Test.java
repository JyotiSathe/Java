package com.tcs.java.training.exam;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test().foo(true,true);
		new Test().foo(true,false);
		new Test().foo(false,true);
		new Test().foo(false,false);
		
	}
	

	public void foo(boolean a,boolean b){
		if( a ) 
	    {
	        System.out.println("A"); /* Line 5 */
	    } 
	    else if(a && b) /* Line 7 */
	    { 
	        System.out.println( "A && B"); 
	    } 
	    else /* Line 11 */
	    { 
	        if ( !b ) 
	        {
	            System.out.println( "notB") ;
	        } 
	        else 
	        {
	            System.out.println( "ELSE" ) ; 
	        } 
	    } 

	}
}
