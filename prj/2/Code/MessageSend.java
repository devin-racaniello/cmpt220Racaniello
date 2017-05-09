/**Devin Racaniello's Filtered messenger project**/

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/** Extends thread so that the messages can be sent constantly **/
public class MessageSend extends Thread {
	
	//Variables
	String message;
	String hostName;
	int port;
	
	//Empty constructor
	public MessageSend() {
		
	}
	
	//Constructor
	/** Receives the necessary inputs to know where and what message to send**/
	public MessageSend(String message, String hostName, int port) {
		this.message = message;
		this.hostName = hostName;
		this.port = port;
	}
	
	//Method for sending messages
	/** Overrides the thread run method
		creates a socket connection to the desired location and closes it after each message **/
	@Override
	public void run() {
		try {
			Socket sender = new Socket(hostName, port);
			sender.getOutputStream().write(message.getBytes());
			sender.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
