package tcs.java.practise;

public class MethodOverloadingPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fun1('a');
		//int t=5;
		//fun1(t);
		int i=5;
		fun1(i);
	}

	/*public static void fun1(int s){
		System.out.println(s);
	}*/
	
	public static void fun1(float f){
		System.out.println("float");
	}
	
	public static void fun1(double d){
		System.out.println("double");
	}
	
}
