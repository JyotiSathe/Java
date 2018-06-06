package tcs.java.practise;

public class PrintEveryNthElement {

	String str;
	int n;
	public PrintEveryNthElement(String str, int n) {
		// TODO Auto-generated constructor stub
		this.str=str;
		this.n=n;
	}

	public void printElements() {
		// TODO Auto-generated method stub
		for(int i=1;i<=this.str.length()/n;i++){
			int j=i*this.n;
			System.out.print(this.str.charAt(j-1));
		}
	}

}
