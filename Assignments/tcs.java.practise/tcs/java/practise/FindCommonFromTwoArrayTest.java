package tcs.java.practise;

public class FindCommonFromTwoArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr2[]={2,8,10,5,7,81,9};
		int arr1[]={8,4,7,61,50,4,52,72,80};
		FindCommonFromTwoArray obj=new FindCommonFromTwoArray(arr1,arr2);
		obj.printArray(obj.arr1,arr1.length);
		System.out.println();
		obj.printArray(obj.arr2,arr2.length);
		System.out.println();
		int count=obj.findCommonElements();
		System.out.println("Common elements");
		obj.printArray(obj.comm,count);
	}

}
