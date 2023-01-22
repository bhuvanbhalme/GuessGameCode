package basic;

import java.util.Scanner;

public class GuessCode {
    public static void main(String[] args) throws Exception
    {
         Scanner sc=new Scanner(System.in);
    	int number = (int)(Math.random()*100+1);
//    	System.out.println(number);
    	int a=0;
    	System.out.print("...  WELCOME TO GUESSES WORLD  ...\nEnter Your Name : ");
    	String name=sc.nextLine();
    	System.out.println("Guess the number (0 to 100) :  ");
    	while(true)
        {
            int guess=sc.nextInt();
            if(guess<number)
            {
            	System.out.println("lower number , select bigger number");
            }
            else if(guess>number)
            {
            	System.out.println("greter number, select lower number");
            }
            else
            {
            	System.out.println();
            	System.out.println("***  WIN  ***");
            }
            a++ ;
            
            if(guess == number) break;
        }
    	System.out.println(name + " your are find in "+ a +" steps....");  
    	
    }
}



