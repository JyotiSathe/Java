package tcs.java.practise;

public class StringThenAdditionOfNumbers {
	
	String str;

	public StringThenAdditionOfNumbers(String str) {
		// TODO Auto-generated constructor stub
		this.str=str;
	}

	public void displayStringAndSum() {
		// TODO Auto-generated method stub
		String letter = "";
		int number = 0;
		for(int i=0;i<this.str.length();i++){
			if(Character.isDigit(this.str.charAt(i))){
				number+=Integer.parseInt(this.str.charAt(i)+"");
			}else{
				letter+=this.str.charAt(i);
			}
		}
		System.out.println(letter+number);
	}

}
