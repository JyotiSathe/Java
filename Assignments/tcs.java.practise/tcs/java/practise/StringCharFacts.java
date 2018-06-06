package tcs.java.practise;

public class StringCharFacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a';
		String str=(""+ch).toUpperCase();
		char newChar=(""+ch).toUpperCase().charAt(0);
		System.out.println(str+" "+newChar);
		System.out.println(str instanceof String);
	
		char arr[]={'j','y','o','t','i'};
		String name=new String(arr);
		System.out.println(name);
		char newArr[]=name.toCharArray();
		for(char a:newArr){
			System.out.print(a);
		}
	}

}
