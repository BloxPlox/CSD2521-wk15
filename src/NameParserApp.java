/*
Author: James Nagy
Date: 11/17/19
Assignment: Ch13 Exercise 13-1
*/

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        boolean validInput = false;

        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        String name = "";
        
        while (!validInput) {
            
            System.out.print("Enter a name: ");
            name = sc.nextLine();
            System.out.println();

            name = name.trim();

            index1 = name.indexOf(" ");
            index2 = name.indexOf(" ", index1+1);
            index3 = name.indexOf(" ", index2+1);
            
            if (index1 == -1) {
                System.out.println("Error: Please enter a name with more than 1 word.");
                System.out.println();
            }
            else if (index3 != -1 && index2 != -1) {
                System.out.println("Error: Please enter a name with 3 or less words.");
                System.out.println();
            }
            else {
                validInput = true;
            }
        }       
        
        if (index2 == -1) {
            int index = name.indexOf(" ");
            String firstName1 = name.substring(0, index);
            String lastName1 = name.substring(index + 1);
            
            System.out.println("First name: " + firstName1);
            System.out.println("Last name: " + lastName1);
        } 
        else if (index2 != -1 && index3 == -1) {
            String[] nameParts = name.split(" ");
            String firstName2 = nameParts[0];
            String middleName = nameParts[1];
            String lastName2 = nameParts[2];
            
            System.out.println("First name: " + firstName2);
            System.out.println("Middle name: " + middleName);
            System.out.println("Last name: " + lastName2);
        }
        
    }
}
