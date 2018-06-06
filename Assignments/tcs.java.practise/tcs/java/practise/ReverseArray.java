package tcs.java.practise;

public class ReverseArray {

	int a[];
	public ReverseArray(int[] arr) {
		// TODO Auto-generated constructor stub
		this.a=arr;
	}

	public void reverse() {
		// TODO Auto-generated method stub
		for(int i=0,j=this.a.length-1;i<this.a.length/2;i++,j--){
			int temp=this.a[i];
			this.a[i]=this.a[j];
			this.a[j]=temp;
		}
	}

	public void printArray() {
		// TODO Auto-generated method stub
		for(int i=0;i<this.a.length;i++){
			System.out.print(this.a[i]+",");
		}
	}

}
