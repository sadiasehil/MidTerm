package math.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial
{

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int fact =1;
        int Number ;
        Scanner sc =new Scanner (System.in);
        System.out.println(" The Factorial of a given number :");
        System.out.println("give a number :");
        Number=sc.nextInt();

        for (int i=Number;i>=1;i--)
        {
            fact =fact*i;
        }
        System.out.println(" the factorial of the  number :"+ Number+ " is "+fact);

    }

    }

