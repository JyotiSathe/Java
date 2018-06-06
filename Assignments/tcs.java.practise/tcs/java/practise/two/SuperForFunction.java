package tcs.java.practise.two;

class Fruit{
	public void describe(){
		System.out.println("Fruit");
	}
	public void print(){
		System.out.println("print");
	}
}

class Mango extends Fruit{
	public void describe(){
		System.out.println("Mango");
		super.describe();
		print();
	}
}

public class SuperForFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mango obj=new Mango();
		obj.describe();
	}

}
