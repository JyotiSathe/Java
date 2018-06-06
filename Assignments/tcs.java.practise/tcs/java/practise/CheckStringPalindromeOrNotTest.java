package tcs.java.practise;

public class CheckStringPalindromeOrNotTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Nayan";
		CheckStringPalindromeOrNot obj=new CheckStringPalindromeOrNot(str);
		boolean isPalidrome=obj.checkPalindrome();
		if(isPalidrome){
			System.out.println("\""+str+"\" is palindrome");
		}else{
			System.out.println("\""+str+"\" is not palindrome");
		}
	}

}
