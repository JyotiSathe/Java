package com.tcs.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler extends Thread{

	Socket socket=null;
	DataInputStream in;
	DataOutputStream out;

	ClientHandler(Socket s){
		this.socket=s;
		try {
			in=new DataInputStream(socket.getInputStream());
			out=new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run(){
		String reply = "";
		int ans=0;
		try {
			String expression=in.readUTF();
			String arr[]=expression.split("#");
			switch(arr[2]){
			case "+":
				ans=Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
				reply=arr[0]+arr[2]+arr[1]+"="+ans;
				break;
			case "-":
				ans=Integer.parseInt(arr[0])-Integer.parseInt(arr[1]);
				reply=arr[0]+arr[2]+arr[1]+"="+ans;
				break;
			case "*":
				ans=Integer.parseInt(arr[0])*Integer.parseInt(arr[1]);
				reply=arr[0]+arr[2]+arr[1]+"="+ans;
				break;
			case "/":
				try{
					ans=Integer.parseInt(arr[0])/Integer.parseInt(arr[1]);
					reply=arr[0]+arr[2]+arr[1]+"="+ans;
					break;
				}catch(ArithmeticException e){
					System.out.println("Divide by zero");
				}
			}
			out.writeUTF(reply);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
