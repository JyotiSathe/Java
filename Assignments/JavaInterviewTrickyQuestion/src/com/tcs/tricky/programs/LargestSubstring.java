package com.tcs.tricky.programs;

public class LargestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java is pure object oriented language.";
		
		int maxLength=0;
		String maxStr="";
		
		String arr[]=str.split("e");
		for(int i=0;i<arr.length-1;i++){
			System.out.println(arr[i]);
			if(arr[i].length()>maxLength){
				maxLength=arr[i].length();
				maxStr=arr[i];
			}
		}
		
		System.out.println(maxStr);
	}

}
