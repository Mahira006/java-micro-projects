import java.util.*;
class NumberGuessing
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("======Welcome to the Number Guessing Game======");
        int number=(int)(Math.random()*100)+1;
        int guess=0;
        int attempts=0;
        while(guess!=number)
        {
            System.out.print("Enter your guess (1-100): ");
            guess=sc.nextInt();
            attempts++;
            if(guess<number)
            {
                System.out.println("Too low! Try again.");
            }
            else if(guess>number)
            {
                System.out.println("Too high! Try again.");
            }
            else
            {
                System.out.println("Congratulations! You've guessed the number in "+attempts+" attempts.");
            }
        }
    }
}