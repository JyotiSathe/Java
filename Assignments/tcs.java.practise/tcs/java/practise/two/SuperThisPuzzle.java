package tcs.java.practise.two;

class P1{
	P1(){
		System.out.println("ONE");
	}
	P1(int x){
		this();
		System.out.println("TWO");
	}
}

class Q1 extends P1{
	Q1(){
		System.out.println("THREE");
	}
	Q1(int x){
		super();
		System.out.println("FOUR");
	}
	Q1(int a,int b){
		this(a);
		System.out.println("FIVE");
	}
	Q1(int a,int b,int c){
		this(a,b);
		System.out.println("SIX");
	}
}

class R1 extends Q1{
	R1(){
		super(4,5);
	}
}

public class SuperThisPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R1 pbj=new R1();
	}

}
