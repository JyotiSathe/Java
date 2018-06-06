package tcs.java.practise.two;

class One1{
	int num=10;
	int x=20;
}

class Two1 extends One1{
	int num=20;
	int y=30;
	public int change(){
		y=y+x;
		return y;
	}
}

class Three1 extends Two1{
	int num=30;
	int x=40;
	int y=50;
	public int change(){
		System.out.println(x+" "+y);
		x=x+y;
		return x;
	}
}

public class RuntimePolyForVariablePuzzle {
	public static void main(String[] args) {
		Two1 obj=new Three1();
		System.out.println(obj.change());
		System.out.println(obj.num);
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.num+obj.x+obj.y);
		//int result=obj.change();
		//System.out.println(result);
	}
}
