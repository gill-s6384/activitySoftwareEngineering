package myJavaProject;

import java.util.Scanner;

public class myAppTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int input1;
		System.out.println("Enter an even number or 999 to stop");
		input1=input.nextInt();
		/*
		 * This is a git sample code
		 */
		
		while(input1%2==0) {
			System.out.println("Good job!");
			System.out.println("Enter another even value or 999 to stop");
			input1=input.nextInt();
		
			if((input1%2)!=0) {
				System.out.println("It is not an even number!");
				System.out.println("Enter even value or 999 to stop");
				input1=input.nextInt();
			}
			else if(input1==999) {
				
			}
		
		
		}
		
		if((input1%2)!=0) {
			System.out.println("It is not an even number!");
			System.out.println("Enter even value or 999 to stop");
			input1=input.nextInt();
		}
		else if(input1==999) {
			
		}
		
	}

}
