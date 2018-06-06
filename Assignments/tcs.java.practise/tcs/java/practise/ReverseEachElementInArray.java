package tcs.java.practise;

public class ReverseEachElementInArray {
	
	int a[];

	public ReverseEachElementInArray(int[] arr) {
		// TODO Auto-generated constructor stub
		this.a=arr;
	}

	public ReverseEachElementInArray() {
		// TODO Auto-generated constructor stub
	}

	public void reverseElementsInArray() {
		// TODO Auto-generated method stub
		for(int i=0;i<this.a.length;i++){
			a[i]=reverseNum(a[i]);
		}
	}

	public int reverseNum(int num){
		int rev=0;
		while(num>0){
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		return rev;
	}
	
	public void printReversedArray(int arr[]) {
		// TODO Auto-generated method stub
		for(int data:arr){
			System.out.print(data+",");
		}
	}

}
