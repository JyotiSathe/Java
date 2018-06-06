package tcs.java.practise;

public class VariableArgumentsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new VariableArgumentsDemo().add(4,5,6));
		System.out.println(new VariableArgumentsDemo().add(4));
		System.out.println(new VariableArgumentsDemo().add());
		System.out.println(new VariableArgumentsDemo().add(4,5,6,10,12));
	}
	
	public int add(int... a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		
		return sum;
	}

}
