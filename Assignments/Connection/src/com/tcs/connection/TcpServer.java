package com.tcs.connection;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket server=null;
		
		try {
			server=new ServerSocket(9123);
			System.out.println("Server started and waiting ...");
			Socket socket=server.accept();
			
			System.out.println("Client connected ....");
			
			DataInputStream in=new DataInputStream(socket.getInputStream());
			DataOutputStream out=new DataOutputStream(socket.getOutputStream());
			
			String msg=in.readUTF();
			System.out.println("Message from client ... "+msg);
			out.writeUTF("Hello, Welcome to our site");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
