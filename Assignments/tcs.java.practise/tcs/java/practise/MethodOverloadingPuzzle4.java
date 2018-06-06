package tcs.java.practise;

public class MethodOverloadingPuzzle4 {
	
	public static void fun(Integer i){
		System.out.println("Integer");
	}

	public static void fun(Object i){
		System.out.println("object");
	}
	
	public static void fun(String ...i){
		System.out.println("String var arg");
	}
	
	public static void fun(int i,int ...b){
		System.out.println("Int var arg");
	}
	
	public static void fun(Object arr[]){
		System.out.println("object arr");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(5);
		fun(6,7);
		fun(args);
		fun("abc","pqr");
		fun(args[0]);
		fun(new String[]{"abc","pqr"});
		fun(6.7f);
		Float f1=new Float(4.5f);
		Float f2=new Float(5.6f);
		fun(new Float[]{f1,f2});
		}

}
