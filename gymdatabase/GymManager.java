package gymdatabase;
/**
 GymManager class to handle commands given by gym manager
 
 @author Bradley Kolczynkski
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Calendar;




public class GymManager {

	
	public void run() {
		
		System.out.println("Gym Manager running...");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] check;
		try {
			while(true) {
				check = br.readLine().split(" ");
				if(check[0].equals("Q")) {
					System.out.println("Gym Manager terminated.");
					br.close();
					break;
				}
				else {
					
					if(check[0].equals("A")) {
						
						String first = check[1];
						String last = check[2];
						String dob = check[3];
						String exp = check[4];
						String location = check[5];
						
						new Member(first, last, dob, exp);
						System.out.println(first + " " + last + " added.");
						
					}
					else if(check[0].equals("P")) {
						System.out.println("-list of members-");
						
					}
					else if(check[0].equals("PC")) {
						System.out.println("-list of members sorted by county and zipcode-");
					}
					else if(check[0].equals("PN")) {
						System.out.println("-list of members sorted by last name, and first name-");
					}
					else if(check[0].equals("PD")) {
						System.out.println("-list of members sorted by membership expiration date-");
					}
					else {
						System.out.println(check[0] + " is not a valid command!");
					}
					
				}
			}
			
				
			
			
		}
			
			
			
			 catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("invalid command!");
		} 
		
		
	
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
