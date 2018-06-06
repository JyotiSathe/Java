package tcs.java.practise;

public class UseStringForIntergerOperationsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=12321;
		System.out.println("To check if "+number+" is palindrome, better convert to String");
		UseStringForIntergerOperations obj=new UseStringForIntergerOperations(number);
		boolean isPalindrome=obj.toCheckPalindrome();
		if(isPalindrome){
			System.out.println("so "+number+" is palindrome");
		}else{
			System.out.println(number+" is not palidrome");
		}
		
		System.out.println();
		System.out.println("To find number of digits, convert to string and find length using lenth()");
		int len=obj.findLength();
		System.out.println("so length of "+number+" is "+len);
		
		System.out.println();
		System.out.println("to replace a digit from String, converting to String and using replace()");
		String replacedStr=obj.replaceString();
		System.out.println(replacedStr+" is new String");
	}

}
