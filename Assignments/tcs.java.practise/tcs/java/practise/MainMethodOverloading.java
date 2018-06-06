package tcs.java.practise;

public class MainMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainMethodOverloading().main(5);
		main("jyoti");
	}

	public void main(int num){
		System.out.println("int main");
	}
	
	public static void main(String s){
		System.out.println("string main");
	}
}
