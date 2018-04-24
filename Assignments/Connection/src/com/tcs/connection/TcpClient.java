package com.tcs.connection;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	public static void main(String[] args) {
		Socket socket=null;
		
		try {
			System.out.println("Connectin to server ... ");
			socket=new Socket("localhost", 9123);
			System.out.println("Client connected .... ");
			
			DataInputStream in=new DataInputStream(socket.getInputStream());
			
			DataOutputStream out=new DataOutputStream(socket.getOutputStream());
			out.writeUTF("Hi");
			String reply=in.readUTF();
			System.out.println("Reply from server"+reply);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
