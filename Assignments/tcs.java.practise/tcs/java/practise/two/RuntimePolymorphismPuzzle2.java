package tcs.java.practise.two;

class X{
	public void fun1(){
		System.out.println("X:fun1");
	}
	public void fun3(){
		System.out.println("X:fun3");
	}
}

class Y extends X{
	public void fun2(){
		System.out.println("Y:fun2");
	}
}

class Z extends Y{
	public void fun1(){
		System.out.println("Z:fun1");
	}
}

public class RuntimePolymorphismPuzzle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y obj=new Z();
		obj.fun1();
		obj.fun2();
		obj.fun3();
	}

}
