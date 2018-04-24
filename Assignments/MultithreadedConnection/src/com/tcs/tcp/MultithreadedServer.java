package com.tcs.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultithreadedServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket server=null;
		try {
			server=new ServerSocket(7890);
			int count=1;
			while(true){
				System.out.println("Waiting for client# "+count);
				Socket s=server.accept();
				ClientHandler t=new ClientHandler(s);
				t.start();
				count++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
