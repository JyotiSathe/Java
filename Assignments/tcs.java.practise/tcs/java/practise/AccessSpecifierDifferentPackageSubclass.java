package tcs.java.practise;

import tcs.java.practise.two.AccessSpecifierWithinClass;

public class AccessSpecifierDifferentPackageSubclass extends AccessSpecifierWithinClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifierDifferentPackageSubclass obj=new AccessSpecifierDifferentPackageSubclass();
		//System.out.println("private: "+obj.a);//error
		//System.out.println("dafalut/package: "+obj.b);//error
		System.out.println("protected: "+obj.c);
		System.out.println("public: "+obj.d);

	}

}
