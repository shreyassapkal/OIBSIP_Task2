//Shreyas Sapkal
//Java Programming
//Task-2 Number guessing

import java.util.Scanner;
public class Number_Guessing {
	public static void No_Guessing()
	{
		
		Scanner sc = new Scanner(System.in);
		int num=1+(int)(100*Math.random()); //This Will randomly select number between 1 to 100
		int chance=5;
		int j,guess,again,pts=0;
		
		System.out.println(" Welcome to Guess the Number game..");
		System.out.println( "Give any number between 1 to 100");
		
		
		for(j=0;j<5;j++) {
			System.out.println("\nTry to Guess a number..");
			guess=sc.nextInt();
			
			
			
			if(guess>100 || guess<0) {
				System.out.println("Sorry!! Enter only numbers between 1 to 100");
			}
			else if(guess==num) 
			{
				System.out.println("Congrats!! You guessed the right number ");
				pts+=10;
				System.out.println("Your score is "+pts);
				break;
			}
			else if (guess>num && j!=chance-1) {
				System.out.println("Oops! Number is less than"+guess);
			}
			else if(guess<num && j!=chance-1) {
				System.out.println("Oops! Number is greater than"+guess);
			}
		}
		
		if(chance==j) {
			System.out.println("\nYou have completed round");
			System.out.println("\nThe number is "+num);
			System.out.println("\n\nDo you want to continue..");
			System.out.println("Enter 1 to continue...");
			again=sc.nextInt();
			
			
			if(again==1) {
				No_Guessing();   //this will call function again and start game again
			}
			else {
				System.out.println("Hope You Enjoyed !!");
			}
		}
		sc.close();
	}
	public static void main(String[] args) {
		No_Guessing();
	}
}