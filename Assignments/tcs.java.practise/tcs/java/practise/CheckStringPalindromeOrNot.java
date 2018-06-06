package tcs.java.practise;

public class CheckStringPalindromeOrNot {

	String str;
	
	public CheckStringPalindromeOrNot(String str) {
		// TODO Auto-generated constructor stub
		this.str=str;
	}

	public boolean checkPalindrome() {
		// TODO Auto-generated method stub
		ReverseEachElementInStringArray obj=new ReverseEachElementInStringArray();
		String reversedStr=obj.reverse(this.str);
		if(reversedStr.equalsIgnoreCase(this.str)){
			return true;
		}
		return false;
	}

}
