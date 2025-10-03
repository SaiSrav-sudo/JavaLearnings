
package com.shristi.trainings;

public class SwitchDemo {
	public static void name(String[] args) {
		String choice = "Read";
		switch(choice.toUpperCase()) {
		case "READ":
		System.out.println("Reading the file");
		break; 
		
		case "Write":
			System.out.println("Writing the file");
		break;
		default:
			System.out.println("Wrong choice");
		
			}
		
	}

}
