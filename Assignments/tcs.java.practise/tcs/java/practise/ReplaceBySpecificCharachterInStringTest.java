package tcs.java.practise;

public class ReplaceBySpecificCharachterInStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is good tutorial";
		ReplaceBySpecificCharachterInString obj=new ReplaceBySpecificCharachterInString(str);
		String replacedStr=obj.replaceLetter();
		System.out.println(replacedStr);
	}

}
