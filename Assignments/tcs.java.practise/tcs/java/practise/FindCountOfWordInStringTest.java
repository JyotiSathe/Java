package tcs.java.practise;

public class FindCountOfWordInStringTest {
	public static void main(String[] args) {
		String str="Today is wednesday. This is Java lecture";
		String word="is";
		FindCountOfWordInString obj=new FindCountOfWordInString(str,word);
		int count=obj.getCount();
		System.out.println("\""+word+"\" is present in \""+str+"\" "+count+" times");
		count=obj.getCountStr();
		System.out.println("\'"+word+"\' is present in \""+str+"\" "+count+" times");
	}
}
