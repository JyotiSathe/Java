package tcs.java.practise.two;

class A{
	public void fun1(){
		System.out.println("A:fun1");
	}
	public void fun2(){
		System.out.println("A:fun2");
	}
}

class B extends A{
	public void fun3(){
		System.out.println("B:fun3");
	}
}

class C extends B{
	public void fun1(){
		System.out.println("C:fun1");
	}
}

class D extends C{
	public void fun3(){
		System.out.println("D:fun3");
	}
}

public class RuntimePolymorphismPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new D();
		//A obj1=new C();
		obj.fun1();
		obj.fun2();
		obj.fun3();
		//obj1.fun3();//error
	}

}
