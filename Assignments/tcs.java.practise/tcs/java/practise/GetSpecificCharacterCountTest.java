package tcs.java.practise;

public class GetSpecificCharacterCountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java is oop language";
		char ch='a';
		GetSpecificCharacterCount obj=new GetSpecificCharacterCount(str,ch);
		int count=obj.getCount();
		System.out.println("Count of"+obj.ch+" is "+count);
	}

}
