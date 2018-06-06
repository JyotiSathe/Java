import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MathsServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server=new ServerSocket(8901);
		Socket socket=server.accept();
		DataInputStream in=new DataInputStream(socket.getInputStream());
		DataOutputStream out=new DataOutputStream(socket.getOutputStream());
		String reply = null;
		int ans=0;
		String expression=in.readUTF();
		String arr[]=expression.split("#");
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
		switch(arr[2]){
		case "+":
			ans=Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
			reply=arr[0]+" "+arr[2]+" "+arr[1]+"="+ans;
			break;
		case "-":
			ans=Integer.parseInt(arr[0])-Integer.parseInt(arr[1]);
			reply=arr[0]+" "+arr[2]+" "+arr[1]+"="+ans;
			break;
		case "*":
			ans=Integer.parseInt(arr[0])*Integer.parseInt(arr[1]);
			reply=arr[0]+" "+arr[2]+" "+arr[1]+"="+ans;
			break;
		case "/":
			try{
				ans=Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
				reply=arr[0]+" "+arr[2]+" "+arr[1]+"="+ans;
				break;
			}
			catch(ArithmeticException e){
				e.printStackTrace();
			}
		}
		out.writeUTF(reply);

	}

}
