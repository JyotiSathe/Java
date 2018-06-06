package tcs.java.practise;

public class ReverseEachElementInArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={12,89,71,90,42,55};
		ReverseEachElementInArray obj=new ReverseEachElementInArray(arr);
		obj.printReversedArray(arr);
		obj.reverseElementsInArray();
		System.out.println();
		obj.printReversedArray(obj.a);
	}

}
