package tcs.com.java.eight;

public class StaticMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(InterfaceWithStatic.getSomethingStatic());
		
		SomeClass s=new SomeClass();
		System.out.println(s.getSomething());
		//System.out.println(s.getSomethingStatic);
	}

}
