package tcs.java.practise;

public class CommandLineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len=args.length;
		System.out.println("Length "+len);
		
		int rno=Integer.parseInt(args[0]);
		String name=args[1];
		float per=Float.parseFloat(args[2]);
	
		System.out.println("Rno="+rno+"\nName="+name+"\nPer="+per);
	}

}
