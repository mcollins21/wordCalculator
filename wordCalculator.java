import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class wordCalculator {
    public static void main(String[] args) {

        System.out.println("Welcome to the Word Calculator... \nPlease type in the operation you would like to perform. ");

        Scanner typeOpp = new Scanner(System.in);  //initializes Scanner typeOpp

        System.out.print("\n");

        ArrayList<String> oppList = new ArrayList<String>();    //initializes oppList and adds operations
        oppList.add("1. Addition");
        oppList.add("2. Subtraction");
        oppList.add("3. Multiplication");
        oppList.add("4. Division");

/*
        for(String element : oppList){  //prints out the list 4 times
            System.out.println(oppList);
        }
*/
        System.out.println(oppList.toString());         //prints out the list of calculator operations
        System.out.println("\nPlease type what operation you would like to perform");

        String selectOpp = typeOpp.nextLine();

        System.out.println("\n");
        System.out.print("You have selected: " + selectOpp);        //prints out what user has selected and confirms choice

        System.out.println("\nIs this the correct operation? Y/N to continue... ");
        Scanner confirmChoice = new Scanner(System.in);

        String confirmLetter = confirmChoice.nextLine();

        if (confirmLetter.equals("Y")) {                            //confirms with the user the correct operation was selected.
            System.out.println("Positive Confirmation...");            //edge cases with capitalization were addressed
        } else if (confirmLetter.equals("y")) {
            System.out.println("Positive Confirmation...");
        } else if (confirmLetter.equals("N")) {
            System.out.println("Negative Confirmation. Please Restart Word Calculator");
            exit(1);
        } else if (confirmLetter.equals("n")) {
            System.out.println("Negative Confirmation. Please Restart Word Calculator");
            exit(1);
        } else {
            System.out.print("Invalid Input. Please Restart Word Calculator");
            exit(1);
        }

        Scanner inputNumber = new Scanner(System.in);

        System.out.println("\nPlease type in first number of your calculation");        //first input number
        double num1 = inputNumber.nextDouble();

        System.out.println("\nPlease type in second number of your calculation");       //second input number
        double num2 = inputNumber.nextDouble();

        if (selectOpp.equals("Addition")) {             // if user typed addition then run through addition
            double sum = num1 + num2;
            System.out.print("\n" + sum);
        } else if (selectOpp.equals("Subtraction")) {
            double sum = num1 - num2;
            System.out.print("\n" + sum);
        } else if (selectOpp.equals("Multiplication")) {
            double sum = num1 * num2;
            System.out.print("\n" + sum);
        } else if (selectOpp.equals("Division")) {
            double sum = num1 / num2;
            System.out.print("\n" + sum);
        } else {
            System.out.print("\n An Error has Occurred. Please Restart Calculator");
        }

    }
}

