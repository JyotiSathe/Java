package tcs.java.practise;

public class StringBufferBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer=new StringBuffer("Java is oop language");
		StringBuffer buffer2=buffer;
		buffer2.delete(8, 12);
		System.out.println(buffer2);
		
		System.out.println(buffer.reverse());
		System.out.println(buffer.reverse().toString());
		
		System.out.println(buffer2.insert(8,"programming "));
		
		buffer.setCharAt(1, '@');
		System.out.println(buffer);
	}

}
