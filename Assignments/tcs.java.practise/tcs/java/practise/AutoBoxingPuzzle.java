package tcs.java.practise;

class A1{}
class B extends A1{}
class C1 extends B{}

public class AutoBoxingPuzzle {

	public static void fun(A1 obj){
		System.out.println("A");
	}
	
	public static void fun(B obj){
		System.out.println("B");
	}
	
	/*public static void fun(String s){
		System.out.println("String");
	}*/
	
	public static void fun(int j){
		System.out.println("int");
	}
	
	/*public static void fun(Integer i){
		System.out.println("Integer");
	}*/
	
	public static void fun(Object o){
		System.out.println("object");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(98.4f);
		fun("99.5");
		fun(new C1());
		fun('a');
		fun(null);
	}

}
