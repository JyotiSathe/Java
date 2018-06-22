package com.tcs.tricky.programs;

import java.util.ArrayList;

public class removeDuplicatesFromStringWithoutSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> al = new ArrayList<Object>();

		al.add("java");
		al.add('a');
		al.add('b');
		al.add('a');
		al.add("java");
		al.add(10.3);
		al.add('c');
		al.add(14);
		al.add("java");
		al.add(12);
		System.out.println(al);

		Object[] st = al.toArray();
		for (Object s : st) {
			if (al.indexOf(s) != al.lastIndexOf(s)) {
				al.remove(al.lastIndexOf(s));
			}
		}
		System.out.println(al);
		
		ArrayList<Object> al2=new ArrayList<Object>();
		
		al2.add("java");
		al2.add('a');
		al2.add('b');
		al2.add('a');
		al2.add("java");
		al2.add(10.3);
		al2.add('c');
		al2.add(14);
		al2.add("java");
		al2.add(12);
		
		System.out.println(al2);
		for(int i=0;i<al2.size();i++){
			for(int j=i+1;j<al2.size();j++){
				if(al2.get(i).equals(al2.get(j))){
					al2.remove(j);
					j--;
				}
				
			}
		}
		System.out.println(al2);
		
	}

}
