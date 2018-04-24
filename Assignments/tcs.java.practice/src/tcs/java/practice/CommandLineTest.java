package tcs.java.practice;

public class CommandLineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n =Integer.parseInt(args[0]);
		System.out.println("Number passed: "+n);*/
		
		int arr[]=new int[args.length];
		int sum=0;
		System.out.println("Provided Numbers");
		for(int i=0;i<args.length;i++){
			arr[i]=Integer.parseInt(args[i]);
			System.out.println(arr[i]);
			sum+=arr[i];
		}
		System.out.println("Sum of all numbers= "+sum);
	}

}
