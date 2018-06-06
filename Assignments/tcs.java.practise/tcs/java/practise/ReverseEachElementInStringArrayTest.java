package tcs.java.practise;

public class ReverseEachElementInStringArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is Java program";
		ReverseEachElementInStringArray obj=new ReverseEachElementInStringArray(str);
		String reversedStr=obj.reverseElement();
		System.out.println(str);
		System.out.println(reversedStr);
		System.out.println(obj.reverse(str));
	}

}
