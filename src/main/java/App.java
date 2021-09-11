/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Mateo Gamero
 */
import java.util.Scanner;
public class App
{
    public static void main (String[] args)
    {
        while (true)
        {
            try
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("Please enter your height in inches ");
                float inches = sc.nextFloat();
                System.out.print("Please enter your weight in pounds ");
                float weights = sc.nextFloat();
                float bmi = (weights / (inches * inches )) * 703;
                System.out.printf("Your BMI is %.1f ", bmi);
                if (bmi > 25)
                {
                    System.out.println("You are overweight. You should see your doctor");
                }
                if (18.5 <= bmi && 25 >= bmi)
                {
                    System.out.println("You are within the ideal weight range");
                }
                if (bmi < 18.5)
                {
                    System.out.println("You are underweight. You should see your doctor");
                }
                break;
            }
            catch (Exception e)
            {
                System.out.println("You must enter a numeric value");
            }
        }
    }
}
