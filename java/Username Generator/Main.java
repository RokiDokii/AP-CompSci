import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = input.nextLine();
        System.out.println("Lucky Numbers: " + (firstName.length() + lastName.length()));
        String reverseInitals = firstName.substring(firstName.length()-1) + lastName.substring(lastName.length()-1);
        System.out.println("Reverse Initals: " + reverseInitals.toUpperCase());
        String userName = firstName.substring(firstName.length()/2) + lastName.substring(lastName.length()/2, lastName.length());
        System.out.println(userName);
    }
  }