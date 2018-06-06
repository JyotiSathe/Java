package tcs.java.practise;

public class ReverseEachElementInStringArray {

	String str;
	
	public ReverseEachElementInStringArray() {
		// TODO Auto-generated constructor stub
	}
	
	public ReverseEachElementInStringArray(String str) {
		// TODO Auto-generated constructor stub
		this.str=str;
	}

	public String reverseElement() {
		// TODO Auto-generated method stub
		String temp="";
		String arr[]=this.str.split(" ");
		
		for(int i=0;i<arr.length;i++){
			temp+=reverse(arr[i])+" ";
		}
		return temp.trim();
	}

/*	public String reverse(String s) {
		// TODO Auto-generated method stub
		String temp="";
		for(int i=0,j=s.length()-1;i<s.length();i++,j--){
			temp+=s.charAt(j);
		}
		return temp;
	}
*/
	public String reverse(String s){
		
		int len=s.length();
		char arr[]=s.toCharArray();
		for(int i=0,j=len-1;i<j;i++,j--){
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		String output=new String(arr);
		return output;
	}
}
