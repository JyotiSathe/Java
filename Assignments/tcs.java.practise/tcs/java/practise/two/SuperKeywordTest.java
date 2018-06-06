package tcs.java.practise.two;

class X1{
	int a;
	int b;
	X1(){
		System.out.println("x:default");
	}
	X1(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("x:para");
	}
}

class Y1 extends X1{
	int r;
	Y1(){
		System.out.println("y:default");
	}
	Y1(int p,int q,int r){
		super(p,q);
		this.r=r;
		System.out.println("y:para");
	}
}

public class SuperKeywordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y1 obj=new Y1();
		Y1 obj2=new Y1(10,20,30);
		System.out.println(obj.a);
		System.out.println(obj2.a+" "+obj2.b+" "+obj2.r);
	}

}
