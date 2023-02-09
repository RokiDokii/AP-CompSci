import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a year.");
        int year = input.nextInt();
        if (year <= 1582)
            System.out.println("Invalid Year.");
        else if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0))
            System.out.println("That's a Leap Year.");
        else
            System.out.println("Not a Leap Year.");
    }
}