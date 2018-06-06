package tcs.java.practise;

public class UseStringForIntergerOperations {

	String str;
	public UseStringForIntergerOperations(int number) {
		// TODO Auto-generated constructor stub
		this.str=number+"";
	}

	public boolean toCheckPalindrome() {
		// TODO Auto-generated method stub
		CheckStringPalindromeOrNot obj=new CheckStringPalindromeOrNot(this.str);
		if(obj.checkPalindrome()){
			return true;
		}
		return false;
	}

	public int findLength() {
		// TODO Auto-generated method stub
		return this.str.length();
	}

	public String replaceString() {
		// TODO Auto-generated method stub
		return this.str.replace('2', '5');
	}

}
