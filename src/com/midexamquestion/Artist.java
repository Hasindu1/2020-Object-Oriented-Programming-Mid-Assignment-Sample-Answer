package com.midexamquestion;

public class Artist extends User {
	private String musicGenere;
	public  int noOfSongs;
	private String[][] songList;

	
	
	public Artist(String name, String email, String musicGenere, String[][] songList,int noOfSongs) {
		super(name, email);
         if(songList.length <= 5) {//Checking whether the number of songs exceeding the song limit 5 if number of songs exceeds 5 then object won't initialize 
			
		
		
		this.musicGenere = musicGenere;
		
		this.songList = songList;
		this.noOfSongs = noOfSongs;
         }
        
	}

	
	public void setSongList(String songList[][]) {//Setting the songList array and displaying the song details
		if(songList.length <= 5) {
		this.songList = songList;
		displaySongList();
		}else {
			System.out.println("NO of songs exceeded!");
		}

	}
	

	public String[][] getSongList() {
		return songList;
	}


	public void displaySongList() {// Displaying the songList
		for (int i = 0; i < songList.length; i++) {
			for (int j = 0; j < songList[i].length; j++) {
				System.out.print(songList[i][j] + " ");
			}
			System.out.println();
		}
	}
	@Override
	public void printDetails() {// displaying the Artist details by overriding the super class printDetails
								// method

		
		System.out.print("Artist name is " + name +"\n" +"Artist email is " +email + "\n" +"Artist musicGenere is " + musicGenere +"\n" +"Number of Songs " + noOfSongs +"\n" +"songList is: " +"\n");
		displaySongList();

	}


	  
}
