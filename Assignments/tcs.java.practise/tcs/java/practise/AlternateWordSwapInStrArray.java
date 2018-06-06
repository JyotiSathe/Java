package tcs.java.practise;

public class AlternateWordSwapInStrArray {
	
	String str;

	public AlternateWordSwapInStrArray(String str) {
		// TODO Auto-generated constructor stub
		this.str=str;
	}

	public String alternateWordSwap() {
		// TODO Auto-generated method stub
		String output="";
		String arr[]=this.str.split(" ");
		for(int i=0,j=1;i<arr.length;i+=2,j+=2){
			String temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		for(String s:arr){
			output+=s+" ";
		}
		return output.trim();
	}

}
