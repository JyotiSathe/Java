package tcs.java.practice;

public class ArrayPassTestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]={0,1,2,3,4,5};
		System.out.println("Before");
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]);
		}
		new ArrayPassTest().Change(input);
		System.out.println("After");
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]);
		}
	}

}
