import java.util.Scanner;

public class Numbergame
{
  public static void main(String args[])
  {
   try (Scanner keyboard = new Scanner(System.in)) {
    int a = 1 + (int) (Math.random() * 99);
       int guess;
    
       System.out.println("I am thinking of a number from 1 to 100 .");
       guess = keyboard.nextInt();
    
       while(guess != a){
        if (guess > a)
       {  
         System.out.println("higher!");
        }
       
       else if (guess < a) 
       {
        System.out.println("higher!");
       }
       
       else 
       {
         System.out.println("Congratulations.   You guessed the number with X tries!");
        }
    
       }
}
  }
}