package tcs.java.practise;

public class NumberThenStringFromAString {
	
	String str;

	public NumberThenStringFromAString(String str) {
		// TODO Auto-generated constructor stub
		this.str=str;
	}

	public void displayNumberAndLetter() {
		// TODO Auto-generated method stub
		String number = "";
		String letter = "";
		for(int i=0;i<this.str.length();i++){
			char ch=this.str.charAt(i);
			if(Character.isDigit(ch)){
				number+=ch;
			}else{
				letter+=ch;
			}
		}
		System.out.println(number+letter);
	}

}
