/**Devin Racaniello's Filtered messenger project**/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/** Extends thread so that the messages can be received constantly **/
public class MessageReceive extends Thread {
	
	//Variables
	ServerSocket server;
	int port = 8899;
	Writable listener;
	
	//Constructor
	/** Receives a writable object so the inputs can be sent to the user **/
	public MessageReceive(Writable listener,int port) {
		this.port = port;
		this.listener = listener;
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
	
	//Empty constructor
	public MessageReceive(){
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Method for receiving messages
	/** Overrides the thread run method
	 	when the client socket is connected it relays the input stream through the write method **/
	@Override
	public void run() {
		Socket clientSocket;
		try {
			while((clientSocket = server.accept()) != null) {
				InputStream stream = clientSocket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(stream));
				String line = br.readLine();
				if(line != null) {
					listener.write(line);
					
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
