package tcs.java.practise;

/*Usage : CommandLineSum 5*/

public class CommandLineSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=Integer.parseInt(args[0]);
		int n=args.length;
		int arr[] = new int[n];
		int sum=0;
		
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(args[i]);
			sum+=arr[i];
			//sum+=i;
		}
		System.out.println("Sum is "+sum);
	}

}
