package tcs.java.practise;

public class MethodOverloadingPuzzleThree {
	
	public static void test(int ...a){
		System.out.println("var arg");
	}
	
	public static void test(Object o){
		System.out.println("object");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(5);
		test(5,10);
		//test(new int[]{5,10});
	}

}
