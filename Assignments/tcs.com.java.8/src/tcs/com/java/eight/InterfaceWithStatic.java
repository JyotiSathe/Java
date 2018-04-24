package tcs.com.java.eight;

public interface InterfaceWithStatic {
	int getSomething();
	static int getSomethingStatic(){
		return 42;
	}
}

class SomeClass implements InterfaceWithStatic{

	@Override
	public int getSomething() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}