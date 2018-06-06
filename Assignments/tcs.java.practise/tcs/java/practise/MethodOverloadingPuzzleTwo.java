package tcs.java.practise;

public class MethodOverloadingPuzzleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun1(9);
		fun1(9.8);// converted to double
		fun1(9.8f);// if float is commented, converted to double
//		fun1(short(9));
	}

	public static void fun1(short s){
		System.out.println("short");
	}
	
	public static void fun1(int i){
		System.out.println("int");
	}
	
	/*public static void fun1(float f){
		System.out.println("float");
	}*/
	
	public static void fun1(double d){
		System.out.println("double");
	}
}
