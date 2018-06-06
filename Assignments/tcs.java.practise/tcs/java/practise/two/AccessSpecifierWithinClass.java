package tcs.java.practise.two;

public class AccessSpecifierWithinClass {

	private int a=1;
	int b=2;//default
	protected int c=3;
	public int d=4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifierWithinClass obj=new AccessSpecifierWithinClass();
		System.out.println("private: "+obj.a);
		System.out.println("dafalut/package: "+obj.b);
		System.out.println("protected: "+obj.c);
		System.out.println("public: "+obj.d);
	}

}
