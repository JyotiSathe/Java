import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MathsClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket=new Socket("localhost", 8901);
		DataInputStream in=new DataInputStream(socket.getInputStream());
		DataOutputStream out=new DataOutputStream(socket.getOutputStream());
		
		System.out.println("Mathematical operations....");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		int n1=sc.nextInt();
		System.out.println("Enter number 2");
		int n2=sc.nextInt();
		
		System.out.println("Which operation you want to perform");
		System.out.println("1:+ , 2:- , 3:* , 4:/");
		String op=sc.next();
		
		String expression=n1+"#"+n2+"#"+op;
		out.writeUTF(expression);
		
		String result=in.readUTF();
		System.out.println(result);
		
	}

}
