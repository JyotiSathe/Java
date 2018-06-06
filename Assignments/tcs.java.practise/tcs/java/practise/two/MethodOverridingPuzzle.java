package tcs.java.practise.two;

class ABC{
	public static void fun(){
		System.out.println("ONE");
	}
}

class PQR extends ABC{
	public static void fun(){
		System.out.println("TWO");
	}
}

public class MethodOverridingPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC obj=new PQR();
		obj.fun();
	}

}
