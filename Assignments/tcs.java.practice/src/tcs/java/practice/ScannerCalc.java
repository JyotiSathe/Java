package tcs.java.practice;

public class ScannerCalc {

	int n1;
	char op=' ';
	int n2;
	public ScannerCalc(int n1, char op, int n2) {
		super();
		this.n1 = n1;
		this.op = op;
		this.n2 = n2;
	}

	public int performOperation(){
		int result=0;
		switch(this.op){
			case '+':result=this.n1+this.n2;
				break;
			case '-':result=this.n1-this.n2;
				break;
			case '*':result=this.n1*this.n2;
				break;
			case '/':
				if(n2!=0){
					result=this.n1/this.n2;
				}
				else{
					System.out.println("Number 2 is 0");
				}
				break;
		}
		return result;
	}
}
