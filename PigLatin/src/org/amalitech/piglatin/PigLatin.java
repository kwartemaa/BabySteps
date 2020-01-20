package org.amalitech.piglatin;
import java.util.Scanner;
public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 
		System.out.println("Please enter your first name");
		Scanner keyboardInput=new Scanner(System.in);
		String FirstName= keyboardInput.next();
		System.out.println("Please enter your last name");
		String LastName=keyboardInput.next();
		String AlteredFirstName=FirstName.toLowerCase();
		String AlteredLastName=LastName.toLowerCase();
	
		String FirstLetterofFirstName="" +FirstName.charAt(1);
		String FirstLetterofLastName="" + LastName.charAt(1);
		System.out.println(FirstLetterofFirstName.toUpperCase()+FirstName.substring(2)
		+ AlteredFirstName.charAt(0) + " " +FirstLetterofLastName.toUpperCase()+LastName.substring(2)
		+ AlteredLastName.charAt(0)) ;
		keyboardInput.close();
		
	
		
		
	}

}
