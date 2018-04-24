package tcs.com.java.eight;

interface InterfaceA {
	public void saySomething();
	public default void sayHi(){
		System.out.println("Hi from InterfaceA");
	}
}

interface InterfaceC {
	public default void sayHi(){
		System.out.println("Hi from InterfaceC");
	}
}


