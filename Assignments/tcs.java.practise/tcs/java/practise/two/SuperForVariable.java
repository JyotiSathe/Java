package tcs.java.practise.two;

class Animal{
	String str="Animal";
}

class Cat extends Animal{
	String str="Cat";
	public void display(){
		System.out.println(super.str+" "+this.str);
	}
}

public class SuperForVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat obj=new Cat();
		obj.display();
	}

}
