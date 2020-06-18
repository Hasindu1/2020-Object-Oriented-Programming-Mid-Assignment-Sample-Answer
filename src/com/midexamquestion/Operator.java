package com.midexamquestion;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.midexamquestion.exceptions.NegativeNumberException;

public class Operator extends User implements Calculations{
	private int empNo;
	private String jobTitle;
	
	
	
	public Operator(String name, String email, int empNo, String jobTitle) {
		super(name, email);
		this.empNo = empNo;
		this.jobTitle = jobTitle;
	}



	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		
		System.out.print("Operator name is " +name +"\n" +"Operator email is " + email +"\n" +"Operator Employee number: " + empNo +"\n"+"Operator designation is " + jobTitle);
	}



	@Override
	public void claculateRevenue(Artist artist) {
		boolean validity =false;
		Scanner input = new Scanner(System.in);
		do {
		
		try {
			
		
		
		System.out.println("Enter the number of downloads");
		int noOfDownloads =input.nextInt();
		if(noOfDownloads < 0) { //Checking whether the input value is a positive number
			throw new NegativeNumberException("Negative number Exception " + noOfDownloads);
		}
		System.out.println("Artist: " + artist.getName());
		float totalSongRates = 0.0f;
		for(int i =0 ; i <artist.getSongList().length ; i++) {
			totalSongRates += Float.parseFloat(artist.getSongList()[i][1]);//Calculating the total of song rates
		}
		float avgSongRate = (totalSongRates / artist.getSongList().length);//Calculating the average song rate
		
		System.out.println("Album revenue is LKR " + noOfDownloads * avgSongRate);//Calculating and displaying the revenue
		validity = true;
		
			
		
		}catch(NegativeNumberException|InputMismatchException e) {//Handling the exception of entering a mismatching input like String for the no of downloads user input
			System.out.println("Plase enter a valid number");
			input.nextLine();
		}
		}while(!validity);//iterating the do-while loop until user enters a correct input
		
		
		input.close();//Closing the Scanner object reference input to avoid memory leaks
		
		
		
		
		
	}
	
	
	

}
