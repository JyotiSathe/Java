package com.tcs.tricky.question;

class A
{
    static void staticMethod()
    {
        System.out.println("Static Method");
    }
}
 
 class MainClass1
{
    public static void main(String[] args)
    {
        A a = null;
 
        a.staticMethod();
    }
}

class A1
{
    static int i = 1111;
 
    static
    {
        i = i-- - --i;

    }
 
    {
        i = i++ + ++i;

    }
}
 
class B extends A1
{
    static
    {
        i = --i - i--;

    }
 
    {
    	
        i = ++i + i++;
        
    }
}
 
class A2
{
    int methodOfA()
    {
        return (true ? null : 0);
    }
}

 class MainClass2
{
    public static void main(String[] args)
    {
        //B b = new B();
 
        //System.out.println(b.i);
    	A2 a=new A2();
    	int b=a.methodOfA();
    	System.out.println(b);
    }
}

 
 class MainClass3
{
    public static void main(String[] args)
    {
        Integer i1 = 127;
 
        Integer i2 = 127;
 
        System.out.println(i1 == i2);
 
        Integer i3 = 128;
 
        Integer i4 = 128;
 
        System.out.println(i3 == i4);
    }
}

 class MainClass4
{
    public static void main(String[] args)
    {
        Integer i = new Integer(null);
 
        //String s = new String(null);
    }
}
 
  class MainClass5
 {
     public static void main(String[] args)
     {
         String s = "ONE"+1+2+"TWO"+"THREE"+3+4+"FOUR"+"FIVE"+5; 
  
         System.out.println(s);
     }
 }
 
  class MainClass6
 {
     static int methodOne(int i)
     {
         return methodTwo(i *= 11);
     }
  
     static int methodTwo(int i)
     {
         return methodThree(i /= 11);
     }
  
     static int methodThree(int i)
     {
         return methodFour(i -= 11);
     }
  
     static int methodFour(int i)
     {
         return i += 11;
     }
  
     public static void main(String[] args)
     {
         System.out.println(methodOne(11));
     }
 }
 
 public class MainClass
 {
     public static void main(String[] args)
     {
         int i = 10 + + 11 - - 12 + + 13 - - 14 + + 15;
  
         System.out.println(i);
     }
 }