package tcs.java.practise.two;

public class AccessSpecifierWithinPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifierWithinClass obj=new AccessSpecifierWithinClass();
		//System.out.println("private: "+obj.a);//error
		System.out.println("dafalut/package: "+obj.b);
		System.out.println("protected: "+obj.c);
		System.out.println("public: "+obj.d);
	}

}
