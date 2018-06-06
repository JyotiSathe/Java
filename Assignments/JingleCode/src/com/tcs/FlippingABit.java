package com.tcs;

public class FlippingABit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="10110101101";
		int j=3;
		int k=4;
		char[] arr;
		char[] temp=input.toCharArray();
		if(j<=0 || k<=0){
			System.out.println("-1");
		}else{
			System.out.println("need to add code");
			arr = input.toCharArray();
			
			for(int i=0;i<arr.length;i++){
				System.out.print(temp[i]);
			}
			System.out.println("");
			for(int i=j-1;i<arr.length;i+=j){
				if(arr[i]=='0'){
					arr[i]='1';
				}else{
					arr[i]='0';
				}
			}
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]);
			}
			System.out.println("");
			for(int i=k-1;i<arr.length;i+=k){
				if(arr[i]=='0'){
					arr[i]='1';
				}else{
					arr[i]='0';
				}
			}
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]);
			}
			System.out.println("");
			for(int i=0;i<temp.length;i++){
				System.out.print(temp[i]);
			}
			System.out.println("");
			int count=0;
			for(int i=0;i<arr.length;i++){
				if(arr[i]==temp[i]){
					System.out.print("i->"+arr[i]+"->"+temp[i]);
					count++;
					System.out.print("->"+count);
				}
				System.out.println("");
			}
			System.out.println("count"+count);
		}
	}

}
