/**Devin Racaniello's Filtered messenger project**/

import java.util.Scanner;

/** Implements writable so that it can receive the .write from messageReveive **/
public class Display implements Writable{
	
	Scanner input = new Scanner(System.in);
	
	//Variables
	MessageReceive listener;
	String message = "";
	String host;
	String userName;
	String otherUserName;
	int port;
	int targetPort;
	int filterNum;
	int filterNum2;
	String sender;
	String replacer = "a";
	
	//Overrides the writable implement
	@Override
	public void write(String sender) {
		for(int i = 0; i <= sender.length()+1; i++) {
			if (sender.charAt(i) == ':') {
				otherUserName = sender.substring(0, i);
				sender = sender.substring(i+2);
				break;
			}
		}
		sender = inFilter(sender);
		System.out.print(otherUserName +": "+ sender+"\n");

	}
	
	//Receives user name
	public void inputUsername()  {
		System.out.print("Input your UserName:");
		userName = input.next();
	}

	//Opens your port
	public void listenPort()  {
		System.out.print("Input your port:");
		port = input.nextInt();
		listener = new MessageReceive(this, port);
		listener.start();
	}
	
	//Receives target port
	public void targetPort() {
		System.out.print("Input the targets port:");
		targetPort = input.nextInt();
	}
	
	//Receives host IP address
	public void listenHost() {
		System.out.print("Input the host:");
		host = input.next();
	}
	
	//Receives message input and runs through filter
	public void inputMessage() {
		message = input.nextLine();
		
		if (message.equals("/setfilter")) {
			this.setFilters();
		} 
		else if (message.equals("")) {
			
		}
		else if (message.equals("/setusername")) {
			this.inputUsername();
		}
		else {
			message = outFilter(message);
			message = userName + ": " + message;
			this.sendMessage();
		}

		
	}
	
	//Sends the message
	public void sendMessage() {
		MessageSend transmitter = new MessageSend(message, host, targetPort);
		transmitter.start();
	}
	
	//Recieves the input on what filters to use
	public void setFilters() {
		System.out.print("Which outgoing filter(0 for none):");
		filterNum = input.nextInt();
		if (filterNum == 5) {
			System.out.print("What replacer:");
			replacer = input.next();
		}
		
		System.out.print("Which incoming filter(0 for none):");
		filterNum2 = input.nextInt();
		if (filterNum2 == 5) {
			System.out.print("What replacer");
			replacer = input.next();
		}
		
		
	}
	
	//Sets the outgoing filter
	public String outFilter(String message) {
		Filter filter = new Filter(message);
		switch (filterNum) {
		case 1: message = filter.customFilter1(); break;
		case 2: message = filter.customFilter2(); break;
		case 3: message = filter.encrypt(); break;
		case 4: message = filter.unEncrypt(); break;
		//case 3: message = filter.customFilter3(); break;
		//case 4: message = filter.customFilter4(); break;
		case 5: message = filter.firstLetterOfWordSwitch(replacer); break;
		case 6: message = filter.reverse(); break;
		}
		
		return message;
		
	}
	
	
	//sets the incoming filter
	public String inFilter(String sender) {
		Filter filter = new Filter(sender);
		switch (filterNum2) {
		case 1: sender = filter.customFilter1(); break;
		case 2: sender = filter.customFilter2(); break;
		case 3: sender = filter.encrypt(); break;
		case 4: sender = filter.unEncrypt(); break;
		//case 3: sender = filter.customFilter3(); break;
		//case 4: sender = filter.customFilter4(); break;
		case 5: sender = filter.firstLetterOfWordSwitch(replacer); break;
		case 6: sender = filter.reverse(); break;
		}
		
		return sender;
		
	}
	
	
	
	

}
