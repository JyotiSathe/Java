package tcs.java.practise;

import tcs.java.practise.two.AccessSpecifierWithinClass;

public class AccessSpecifierDifferentPackageDifferentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifierWithinClass obj=new AccessSpecifierWithinClass();
//		System.out.println("private: "+obj.a);//error
//		System.out.println("dafalut/package: "+obj.b);//error
//		System.out.println("protected: "+obj.c);//error
		System.out.println("public: "+obj.d);
	}

}
