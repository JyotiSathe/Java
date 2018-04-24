package tcs.com.java.eight;

public class MyClass implements InterfaceA,InterfaceC{

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		//System.out.println("sayHi() in MyClass");
		InterfaceC.super.sayHi();
		
	}

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub
		System.out.println("Say something");
	}

	public static void main(String[] args) {
		MyClass c=new MyClass();
		c.sayHi();
		c.saySomething();
	}
}
