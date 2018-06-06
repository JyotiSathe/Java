package tcs.java.practise;

public class MaxElementFromAnArray {
	int a[];
	int max;
	public MaxElementFromAnArray(int[] arr) {
		// TODO Auto-generated constructor stub
		this.a=arr;
	}

	public void findMax() {
		// TODO Auto-generated method stub
		this.max=this.a[0];
		for(int i=1;i<this.a.length;i++){
			if(this.a[i]>this.max){
				this.max=this.a[i];
			}
		}
	}

	public void printMaxElement() {
		// TODO Auto-generated method stub
		System.out.println("Largest Element from An Array is "+this.max);
	}

}
