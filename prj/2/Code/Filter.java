/**Devin Racaniello's Filtered messenger project**/

import java.util.Scanner;

public class Filter {

	//Variables
	String message;
	int array[];
	Scanner input = new Scanner(System.in);
	
	//Empty Constructor
	public Filter() {
		
	}
	//Constructor with message
	public Filter(String message) {
		this.message = message;
	}
	
	//String to integer array method
	public int[] toInts() {
		int newArray[] = new int[message.length()];
		for (int i = 0; i <= message.length()-1; i++){
			newArray[i] = (int)message.charAt(i);
		}
		return newArray;
	}
	
	//Add to integer array method
	public int[] addToInts(int[] array,int amount) {
		for (int i = 0; i <= array.length-1; i++){
			array[i] = array[i] + amount;
		}
		
		return array;
	}
	
	//Return integers to string
	public void backToString(int[] array) {
		String message = "";
		for (int i = 0; i <= array.length-1; i++){
			message += Character.toString((char)array[i]);
			//System.out.print(Character.toString((char)array[i]));
			//System.out.print((char)array[i]);
			//System.out.print(array[i]);
		}
		
		this.message = message;
	}
	
	//Returns integers as string of integers
	public void makeArrayString(int[] array) {
		String message = "";
		for (int i = 0; i <= array.length-1; i++){
			message += (array[i]);
			//System.out.print(Character.toString((char)array[i]));
			//System.out.print((char)array[i]);
			//System.out.print(array[i]);
		}
		
		this.message = message;
	}
	
	//Replaces characters
	public void replaceCharacter(String character, String character2) {
		this.message = this.message.replace(character.charAt(0), character2.charAt(0));
	}
	
	//Replaces the first letter of each word
	public String firstLetterOfWordSwitch(String replacer) {
		this.message = replacer + this.message.substring(1, this.message.length());
		for (int i = 0; i <= this.message.length() - 1; i++) {
			if (this.message.charAt(i) == ' ' && this.message.charAt(i+1) != ' ') {
				this.message = this.message.substring(0, i+1) + replacer + this.message.substring(i+2, this.message.length());
			}
		}
		return this.message;
	}
	
	//Reverses the string
	public String reverse() {
		String newMessage = "";
		for (int i = 0; i <= this.message.length() - 1; i++) {
			newMessage = newMessage + this.message.charAt(this.message.length()-(i+1));
		}
		return newMessage;
	}
	
	//Encrypts the string
	public String encrypt() {
		this.message = this.reverse();
		this.replaceCharacter(" ", "®");
		this.replaceCharacter("a", "©");
		array = this.toInts();
		array = addToInts(array,5);
		this.backToString(array);
		
		return this.message;
	}
	
	//Decrypts the string
	public String unEncrypt() {
		array = this.toInts();
		array = addToInts(array,-5);
		this.backToString(array);
		this.replaceCharacter("©", "a");
		this.replaceCharacter("®", " ");
		this.message = this.reverse();
		
		return this.message;
	}
	
	//Custom filter
	public String customFilter1() {
		this.replaceCharacter(" ", "-");
		return this.message;
	}
	
	//Custom filter
	public String customFilter2() {
		array = this.toInts();
		this.makeArrayString(array);
		return this.message;
	}
	
	//Custom filter
	public String customFilter3() {
		array = this.toInts();
		array = addToInts(array,3);
		this.backToString(array);
		return this.message;
	}
	
	//Custom filter
	public String customFilter4() {
		array = this.toInts();
		array = addToInts(array,-3);
		this.backToString(array);
		return this.message;
	}
	
	
	
}