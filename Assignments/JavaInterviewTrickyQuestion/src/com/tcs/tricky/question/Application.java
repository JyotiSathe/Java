package com.tcs.tricky.question;

interface IFruit
{
    public String TYPE = "Apple";
}

class Fruit implements IFruit
{

}

 class Application1 {
    public static void main(String[] args) {
        System.out.println(Fruit.TYPE);
    }
}

class Fruit1 {
    protected static String name = "Sue";
}

class Apple extends Fruit1 {
    
}

 class Application2 {
    public static void main(String[] args) {
        System.out.println(Apple.name);
    }
}

public class Application {
    public static void main(String[] args) {
        
        final class Constants {
            //public static  String name = "PI";
        }
        
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                //System.out.println(Constants.name);
            }
            
        });
        
        thread.start();
    }
}