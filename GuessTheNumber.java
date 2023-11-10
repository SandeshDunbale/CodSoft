import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		
		Scanner A=new Scanner(System.in);
		Random Number=new Random();
		
		int L=1;
		int H=100;
		int number_of_attempts=6;
		int score=0;
		String name;
		
		System.out.println("Please Enter Your Name:");
		name=A.nextLine();
		System.out.println("Dear " + name + "\nWelcome To The number Guessing Game!!!!");
		
		do
		{
			int GeneratedNumber = Number.nextInt(H-L+1)+L;
			int guess;
			boolean correctGuess=false;
			
			System.out.println("The System Has Generated a Number between " + L + " and " + H + " Guess the Number");
			for(int attempt=1;attempt<=number_of_attempts;attempt++)
			{
				System.out.println("Attempt " + attempt + " Enter Your Guess:");
				guess=A.nextInt();
				
				if(guess==GeneratedNumber)
				{
					System.out.println("Congrats!!!You got it Correct in the attempt number " + attempt);
					correctGuess=true;	
					score+=number_of_attempts-attempt+1;
					break;
				}
				else if(guess<GeneratedNumber)
				{
					System.out.println("Too Low,Try Again!!!");
				}
				else
				{
					System.out.println("Too High,Try Again!!!");
				}
			}
			if(!correctGuess)
			{
				System.out.println("You've Ran Out of Attempts,The correct Number is:" + GeneratedNumber);
			}
			System.out.println("Do you Wanna Play again?(Yes/No)");
		}
		while(A.next().equalsIgnoreCase("Yes"));{
			System.out.println("Thanks For Playing \nYour Total Score is:"+ score );
			A.close();
		}
		
	}

}
