package com.midexamquestion;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.midexamquestion.exceptions.NegativeNumberException;

public class PlaySong {
public static void main(String[] args ) {
	boolean noOfSongsValidity = true;
	do {
	try {
		
	String[][] songList = new String[5][2];//Creation of the song list 

   
	Scanner input = new Scanner(System.in);
	for(int i =0 ; i < songList.length ; i++) {
		boolean songRateValidity = false;
		boolean songNameValidity = false;
		
	do {
		
		System.out.println("Enter song:");
	    
		
		String songName = input.nextLine();
		songList[i][0]= songName;
		if(!songName.equals("")) {
			songNameValidity=true;//Setting the songNameValidity to true if user input is not empty
			
		}
		else {
			System.out.println("Please enter a valid song name");
		}
	}while(!songNameValidity);//Iterating the do-while loop until user inputs a song name 
		do {
	  try {
		
		System.out.println("Enter rate");
		
		
		float rate = input.nextFloat();
		input.nextLine();
		if(rate < 0) { //Checking whether the user input is a positive number
		      throw new NegativeNumberException("Negative number Exception " + rate);
		}
		songRateValidity = true;//Setting the songRateValidity to true 
		songList[i][1]=Float.toString(rate) ;
		
		
		
	  }catch(NumberFormatException | NegativeNumberException | InputMismatchException e  ) {//Handling the exceptions of mismatching inputs for the rate input and negative numbers
			System.out.println("Please enter a valid numerical value");
			input.nextLine();
		
		}
		}while(!songRateValidity);//Iterating the do-while loop until user enters a correct type of input
		
		
	}
	Artist artist = new Artist ( "Pablo Albo", "pablo@gmail.com", "pop", songList,5 );
	 artist.printDetails ( );
	 Operator operator = new Operator("Simon","simon@playasong.com", 123, "accountant");
	 System.out.println("\n");
	 operator.printDetails();
	 System.out.print("\n" +"\n");
	
	 operator.claculateRevenue(artist);
	
	input.close();//closing the Scanner object reference input to avoid memory leaks
		
	}catch(NullPointerException e) {//Handling the exception of if number of songs exceeded 5 
		System.out.println("No of songs exceeded ! ");
		noOfSongsValidity = false;
	}
	}while(!noOfSongsValidity);//Iterating the do-while loop until the number of songs is not exceeding the value of 5
}
	
}
