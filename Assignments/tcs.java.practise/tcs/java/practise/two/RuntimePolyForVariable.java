package tcs.java.practise.two;

class One{
	int num=1;
	int x=5;
}

class Two extends One{
	int num=2;
	int z=20;
}

class Three extends Two{
	int num=3;
}

public class RuntimePolyForVariable {
	public static void main(String[] args) {
		One obj=new Two();
		System.out.println("obj.num "+obj.num);
		System.out.println("obj.x "+obj.x);
		//System.out.println("obj.z "+obj.z);//error
		Two obj1=new Three();
		System.out.println("obj1.num= "+obj1.num);
	}
}
