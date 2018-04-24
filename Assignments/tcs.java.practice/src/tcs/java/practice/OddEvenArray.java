package tcs.java.practice;

public class OddEvenArray {
		
		public void printArray(int[] a,int len){
			for(int i=0;i<len;i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
		
		public int[] getOddArray(int a[]){
			int temp[]=new int[a.length];
			int j=0;
			for (int i=0;i<a.length;i++){
				if(a[i]%2!=0){
					temp[j]=a[i];
					j++;
				}
			}
			OddEvenArrayTest.oddCount=j;
			return temp;
		}
		
		public int[] getEvenArray(int a[],int len){
			int temp[]=new int[len];
			int j=0;
			for (int i=0;i<a.length;i++){
				if(a[i]%2==0){
					temp[j]=a[i];
					j++;
				}
			}
			return temp;
		}
}
