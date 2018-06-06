package tcs.java.practise;

public class MaximumRepeatedWordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is Java language It is Pure "
				+ "Object Oriented language It is platform indepedent";
		MaximumRepeatedWord obj=new MaximumRepeatedWord(str);
		String repeatedWord=obj.maximumRepeated();
		System.out.println(repeatedWord);

	}

}
