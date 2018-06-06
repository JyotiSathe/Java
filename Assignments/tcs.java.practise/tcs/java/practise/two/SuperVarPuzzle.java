package tcs.java.practise.two;

class M{
	int x=10;
}

class N extends M{
	int x=20;
	int z=super.x;
}

class O extends N{
	int x=30;
	int y=super.x;
}

public class SuperVarPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		O obj=new O();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
	}

}
