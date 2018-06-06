package tcs.java.practise.two;

class Test1{
	public static void test(){
		System.out.println("Test1");
	}
}

class Test2 extends Test1{
	public static void test(){
		System.out.println("Test2");
	}
	public void print(){
		super.test();
	}
}

public class StaticMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 obj=new Test2();
		obj.print();
	}

}
