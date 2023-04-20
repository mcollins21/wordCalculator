import java.util.ArrayList;
import java.util.Scanner;

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


    }
}
