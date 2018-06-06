package tcs.java.practise;

public class GetCountOfCharIgnoreCaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is Interesting";
		char ch='i';
		GetCountOfCharIgnoreCase obj=new GetCountOfCharIgnoreCase(str,ch);
		int count=obj.getCount();
		System.out.println("Count of "+ch+" is "+count);
	}

}
