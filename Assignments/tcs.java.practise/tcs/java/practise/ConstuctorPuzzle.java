package tcs.java.practise;

public class ConstuctorPuzzle {
	
	int a,b;
	public ConstuctorPuzzle() {
		// TODO Auto-generated constructor stub
		//this(14);
		System.out.println("compulsory");
	}
	
	ConstuctorPuzzle(int a){
		System.out.println("one parameter");
		this.a=a;
	}
	
	ConstuctorPuzzle(int a ,int b){
		//this();
		System.out.println("two parameter");
		this.a=a;
		this.b=b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("creating first object");
		ConstuctorPuzzle obj1=new ConstuctorPuzzle();
		System.out.println("\ncreating second object");
		ConstuctorPuzzle obj2=new ConstuctorPuzzle(1,4);
		System.out.println("obj1.a="+obj1.a);
		System.out.println("obj2.a="+obj2.a);
	}

}
