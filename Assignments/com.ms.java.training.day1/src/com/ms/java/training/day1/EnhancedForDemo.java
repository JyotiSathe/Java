package com.ms.java.training.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



class EnhancedForDemo {
	
    public static void main(String[] args){
    	
         int[] numbers = {1,2,3,4,5,6,7,8,9,10};
         
         for (int item : numbers) {
             System.out.println("Count is: " + item);
         }
         
         for (int i=0;i<numbers.length;i++)
         {
        	 System.out.println(numbers[i]);
         }
         
         
         
         Map<String,String> mapDemo = new HashMap<String,String>();
         mapDemo.put("Name", "Jitendra");
         mapDemo.put("Surname", "Patidar");

         for (Map.Entry<String, String> entry : mapDemo.entrySet())
         {
             System.out.println(entry.getKey() + "/" + entry.getValue());
         }
         
         
         Set<String> setDemo  =mapDemo.keySet();
         Iterator<String> itTest = setDemo.iterator();
         while(itTest.hasNext())
         {
        	 System.out.println(mapDemo.get(itTest.next()));
         }
         
         //Set Iterating Example
         for (String string : setDemo) {
        	System.out.println(string);
		 }
         
         
         //Array Iterating Example
         ArrayList<String> arrIterate = new ArrayList<String>();
         
         arrIterate.add("Jitendra");
         arrIterate.add("Patidar");
         
         for(int i=0; i<arrIterate.size();i++)
         {
        	 System.out.println(arrIterate.get(i));
         }
         
         for(String string : arrIterate) {
        	 System.out.println(string);
		 }
         
    }
}