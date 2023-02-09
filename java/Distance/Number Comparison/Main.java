import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input two intergers:"); //Prompts user to enter number
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 == num2){
            System.out.println("You entered the same interger twice!"); //If the two numbers are the same
        } else if (num1 > num2){
            System.out.println(num1 + " is greater."); //If the first number is higher
        } else {
            System.out.println(num2 + " is greater."); //If the second number is higher
        }
        
        if (num1 % 2 == 0 && num2 % 2 == 0){
            System.out.println("Even Steven!"); //If both numbers are even
        } else if (num1 % 2 == 1 && num2 % 2 ==1){
            System.out.println("Odd Todd!"); //If both numbers are odd
        } else {
            System.out.println("Plain Jane!"); //If opposites
        }

        if (num1 % num2 == 0){
            System.out.println(num1 + " is a multple of " + num2); //If first number is multple of second number
        } else if (num2 % num1 == 0){
            System.out.println(num2 + " is a multple of " + num1); //If second number is multple of first number
        } else{
            System.out.println("Not a multple"); //If neither are multiple of each other
        } 
    }
}