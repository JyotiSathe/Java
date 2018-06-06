package tcs.java.practise;

public class SortArray {
	
	int a[];
	
	public SortArray(int[] arr) {
		// TODO Auto-generated constructor stub
		this.a=arr;
	}
	
	public void sort() {
		// TODO Auto-generated method stub
		for(int i=0;i<this.a.length-1;i++){
			for(int j=0;j<this.a.length-i-1;j++){
				if(this.a[j]>this.a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

	public void printArray() {
		// TODO Auto-generated method stub
		for(int data:this.a){
			System.out.print(data+",");
		}
	}
	

}
