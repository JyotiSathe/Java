package tcs.java.practise;

class One{
	int num1=10;
	int num2=20;
	int num3=30;
	
	One(){
		num3=num1+num2;
	}
	
	One(int a){
		this();
		this.num1=a;
	}
	
	One(int a,int b){
		this(a);
		this.num2=b;
	}
	
	One(int a,int b, int c){
		this(a,b);
		this.num3=c;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Num1= "+this.num1+",Num2="+this.num2+",Num3="+this.num3;
	}
}

public class ConstuctorPuzzle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One obj1=new One(4,6,8);
		One obj2=new One(5,7);
		One obj3=new One(9);
		System.out.println(obj1.num3+obj2.num3+obj3.num3);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}

}
