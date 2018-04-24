package com.ms.java.training.day1;

public class OperatorPrecedenceAndParanthesis {
	
	public static void main(String args[])
	{
		
		int result =4 + 3 * 5;
		
		System.out.println(result);
		
		 result =(4 + 3) * 5;
			
		System.out.println(result);
		
		result= 4 + (3 * 5) ;
		
		System.out.println(result);
		
		
		// Example 2
		
		
		System.out.println ((4 * 4) + (8 * 8) * (4 * 4) - 16/4);
		
		//(4 * 4) + (8 * 8) * (4 * 4) - 16/4
			/* Found brackets - highest precedence. more than one, so evaluate left to right */
			
		//16 + (8 * 8) * (4 * 4) - 16/4
		//16 + 64 * (4 * 4) - 16/4
		//16 + 64 * 16 - 16/4
			
			/* brackets finished, back to precedence.  Found multiplicative operators evaluate left to right */
		//16 + 1024 - 16/4
		//16 + 1024 - 4
			/*multiplicative finished, back to precedence.  Found additive operators evaluate left to right */
		
		//1040 - 4
		//1036
			/* Expression fully evaluated. Can now be used / assigned to a variable */
	}

}
