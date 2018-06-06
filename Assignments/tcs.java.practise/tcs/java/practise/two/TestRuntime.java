package tcs.java.practise.two;

class Base{
	public void fun(){
		System.out.println("Base");
	}
}

class Derived extends Base{
	public void fun(){
		System.out.println("Derived");
	}
}

public class TestRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base obj=new Derived();
		obj.fun();
	}

}
