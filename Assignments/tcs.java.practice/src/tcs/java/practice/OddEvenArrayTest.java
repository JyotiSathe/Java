package tcs.java.practice;

public class OddEvenArrayTest {

	public static int oddCount;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,21,8,72,41,9,1,20};
		OddEvenArray obj=new OddEvenArray();
		
		obj.printArray(arr,arr.length);
		
		int odd[]=obj.getOddArray(arr);
		int even[]=obj.getEvenArray(arr,arr.length-oddCount);
		
		obj.printArray(odd,oddCount);
		obj.printArray(even,even.length);
	}

}
