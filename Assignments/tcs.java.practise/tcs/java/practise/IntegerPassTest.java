package tcs.java.practise;

public class IntegerPassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A o1=new A();
		o1.x=30;
		o1.f1(20);
		System.out.println("x="+o1.x);
	}

}

class A{
	int x;
	void f1(int data){
		this.x=this.x+data;
	}
}
