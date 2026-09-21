import java.util.*;
class SmartNumberOperationsToolkit
{
    public static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }

    public static int lcm(int a,int b)
    {
        return (a*b)/gcd(a,b);
    }

    public static int sumOfDigits(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    public static boolean isArmstrong(int n)
    {
        int sum=0,temp=n;
        int digits=String.valueOf(n).length();
        while(temp>0)
        {
            sum+=Math.pow(temp%10,digits);
            temp/=10;
        }
        return sum==n;
    }

    public static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("======Welcome to the smart Number Operations Toolkit======");
        int a;
        int b;
        while(true)
        {
        System.out.println("\nSelect operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. LCM");
        System.out.println("7. GCD");
        System.out.println("8. Power Calculation");
        System.out.println("9. Sum of Digits");
        System.out.println("10. Check Armstrong Number");
        System.out.println("11. Check Prime Number");
        System.out.println("12. Exit");
        System.out.print("\nEnter your choice: ");
        int choice=sc.nextInt();
        if(choice==12)
        {
            System.out.println("Thank You for using Smart Number Operations Toolkit. Goodbye!");
            break;
        }
        switch(choice)
        {
            case 1:
                System.out.print("Enter first number: ");
                a=sc.nextInt();
                System.out.print("Enter second number: ");
                b=sc.nextInt();
                System.out.println("Sum: "+(a+b));
                break;
            case 2:
                System.out.print("Enter first number: ");
                a=sc.nextInt();
                System.out.print("Enter second number: ");
                b=sc.nextInt();
                System.out.println("Difference: "+(a-b));
                break;
            case 3:
                System.out.print("Enter first number: ");
                a=sc.nextInt();
                System.out.print("Enter second number: ");
                b=sc.nextInt();
                System.out.println("Product: "+(a*b));
                break;
            case 4:
                System.out.print("Enter first number: ");
                a=sc.nextInt();
                System.out.print("Enter second number: ");
                b=sc.nextInt();
                try
                {
                    System.out.println("Quotient: "+(a/b));
                }
                catch(ArithmeticException e)
                {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                System.out.print("Enter first number: ");
                a=sc.nextInt();
                System.out.print("Enter second number: ");
                b=sc.nextInt();
                try
                {
                   System.out.println("Remainder: "+(a%b));
                }
                catch(ArithmeticException e)
                {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 6:
                System.out.print("Enter first number: ");
                a=sc.nextInt();
                System.out.print("Enter second number: ");
                b=sc.nextInt();
                System.out.println("LCM: "+lcm(a,b));
                break;
            case 7:
                System.out.print("Enter first number: ");
                a=sc.nextInt();
                System.out.print("Enter second number: ");
                b=sc.nextInt();
                System.out.println("GCD: "+gcd(a,b));
                break;
            case 8:
                System.out.print("Enter the base: ");
                a=sc.nextInt();
                System.out.print("Enter the exponent: ");
                b=sc.nextInt();
                System.out.println("Power: "+Math.pow(a,b));
                break;
            case 9:
                System.out.print("Enter a number: ");
                a=sc.nextInt();
                System.out.println("Sum of digits: "+sumOfDigits(a));
                break;
            case 10:
                System.out.print("Enter a number: ");
                a=sc.nextInt();
                System.out.println("Is Armstrong number: "+isArmstrong(a));
                break;
            case 11:
                System.out.print("Enter a number: ");
                a=sc.nextInt();
                System.out.println("Is prime number: "+isPrime(a));
                break;
            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }
        }
    }
}