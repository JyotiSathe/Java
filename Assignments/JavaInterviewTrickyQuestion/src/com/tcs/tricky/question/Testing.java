package com.tcs.tricky.question;

 class Testing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// the line below this gives an output
        // \u000d System.out.println("comment executed");
	}

}

 class Testing2
{
    public static void main(String[] args)
    {
    loop1:
    for (int i = 0; i < 5; i++)
     {
        for (int j = 0; j < 5; j++) 
        {
            if (i == 3)
                break loop1;
            System.out.println("i = " + i + " j = " + j);
        }
    }
   }
}

public class Testing {
    public static void main(String[] args) {
        
        String one = "Hello";
        String two = "Hello";
        
        if(one == two) {
            System.out.println("one == two");
        }
        else {
            System.out.println("one != two");
        }
    }
}