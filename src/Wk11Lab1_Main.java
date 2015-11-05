

import java.util.Scanner;

public class Wk11Lab1_Main {

		    public static void main(String[] args)
		    {
		    	Wk11_Dice Random = new Wk11_Dice();
		    	Scanner input =  new Scanner(System.in);
		    	System.out.print("Dice Game. Pick a number 1-6: ");
		    	int userGuess = input.nextInt();
		    
		    	System.out.print("You picked: "+userGuess);
		    	Random.Throw();
		    	int compGuess = Random.Value();
		    	System.out.print("\nComputer Roll: "+compGuess);
		    	
		    	if (userGuess == compGuess)
		    	{
		    		System.out.print("\nYou Win!");
		    	}
		    	
		    	else
		    	{
		    		System.out.print("\nYou Lose!");
		    	}
		    	
		    	input.close();
		    	
		    }  	
		    
		
}
	
	

