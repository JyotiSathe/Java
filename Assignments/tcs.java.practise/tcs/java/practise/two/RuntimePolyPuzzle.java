package tcs.java.practise.two;

class First{
	String a;
	int b;
	First(){}
	First(String a,int b){
		System.out.println("first");
		this.a=a;
		this.b=b;
	}
}

class Second extends First{
	int c;
	int d;

	Second(String a, int b, int c, int d) {
		super(a, b);
		System.out.println("second");
		this.c=c;
		this.d=d;
	}

}

class Third extends Second{
	int e;
	int f;

	Third(String a, int b, int c, int d, int e, int f) {
		super(a, b, c, d);
		System.out.println("third");
		this.e=e;
		this.f=f;
	}		
}

public class RuntimePolyPuzzle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Third obj=new Third("1",2,3,4,5,6);
	}
}
