//////////////////////////////////////////////////////////////////////////////
//MarkAlan Mills
// CSC 160 Computer Science I, section 680
// Feb 18, 2022
// Homework 4 - Programming Exercise 4.15 (page 154) Phone Pad
//////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
//Importing Scanner
public class PhonePad {
//Create class
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Create scanner
        System.out.print("Enter a letter:");
        //print message to user
        String L1 = input.nextLine();
        //input letter into a string
        char L2 = L1.charAt(0);
        //convert L1 to a char
        int ASCII = L2;
        //convert L2 to an int

        //Assign ASCII numbers to phone pad numbers
        if (ASCII >= 65 && ASCII <= 67 || ASCII >= 97 && ASCII <= 99) {
            System.out.println("The corresponding number is 2.");

        } else if(ASCII >= 68 && ASCII <= 70 || ASCII >= 100 && ASCII <= 102) {
            System.out.println("The corresponding number is 3.");

        } else if(ASCII >= 71 && ASCII <= 73 || ASCII >= 103 && ASCII <= 105) {
            System.out.println("The corresponding number is 4.");

        } else if(ASCII >= 74 && ASCII <= 76 || ASCII >= 106 && ASCII <= 108) {
            System.out.println("The corresponding number is 5.");

        } else if(ASCII >= 77 && ASCII <= 79 || ASCII >= 109 && ASCII <= 111) {
            System.out.println("The corresponding number is 6.");

        } else if(ASCII >= 80 && ASCII <= 83 || ASCII >= 112 && ASCII <= 115) {
            System.out.println("The corresponding number is 7.");

        } else if(ASCII >= 84 && ASCII <= 86 || ASCII >= 116 && ASCII <= 118) {
            System.out.println("The corresponding number is 8.");

        } else if(ASCII >= 87 && ASCII <= 90 || ASCII >= 119 && ASCII <= 122) {
            System.out.println("The corresponding number is 9.");

        } else {
            System.out.println(L1 +" is an invalid input!");
        }

    }

    
}
