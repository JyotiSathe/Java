package com.tcs.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client1 c1=new Client1();
		c1.operation();
		Client1 c2=new Client1();
		c2.operation();
	}
	
	public void operation(){
		try {
			Socket socket=new Socket("localhost", 7890);
			DataInputStream in=new DataInputStream(socket.getInputStream());
			DataOutputStream out=new DataOutputStream(socket.getOutputStream());
			System.out.println("***Mathematical Operations***");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number 1");
			int n1=sc.nextInt();
			System.out.println("Enter number 2");
			int n2=sc.nextInt();
			
			System.out.println("Which operation you want to perform");
			System.out.println("+ - * /");
			String op=sc.next();
			
			String expression=n1+"#"+n2+"#"+op;
			out.writeUTF(expression);
			String reply=in.readUTF();
			
			System.out.println(reply);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
