package com.shristi.trainings;

public class Switchdemopractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Day = "Tuesday";
		switch(Day.toUpperCase()) {
		case "SUNDAY":
		case "SATURDAY":
			System.out.println("Enjoying weekend");
			break;
			
		case "THURSDAY":
		case "WEDNESDAY":
		case "TUESDAY":
			System.out.println("busy with work");
			break;
			
		case "MONDAY":
			System.out.println("Gloomy days starting to work");
			break;
			
		case "FRIDAY":
			System.out.println("Waiting for weekend");
			break;
			
		default:
			System.out.println("No output");
		
		
		}
	}

}
