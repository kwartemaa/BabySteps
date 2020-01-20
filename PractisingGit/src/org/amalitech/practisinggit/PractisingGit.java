package org.amalitech.practisinggit;
import java.util.Scanner;

public class PractisingGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kybdInput=new Scanner(System.in);
System.out.println("Please enter your score");
double marks=kybdInput.nextFloat();
kybdInput.close();
double standardMark=75.0;


if(marks>=standardMark)
{
	System.out.println("Congratulations! You have made it to the next round.");
	}
else 
{ 
	System.out.println("Sorry, you could not make it to the next round. Try again next time");
	
}

		
	}
}

