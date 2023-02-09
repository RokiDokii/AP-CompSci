import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Ask the user for a String and an integer
    //Assume the user inputs correctly
    System.out.print("Enter a string: ");
    String userString = input.nextLine();
    System.out.print("Enter an interger: ");
    int userInt = input.nextInt();

    //Call the 'shout' method, passing the user's string as a parameter
    BagOfTricks.shout(userString);
    //Output the result of calling reciprocate with the user's integer
    System.out.println(BagOfTricks.reciprocate(userInt));
    //Output the result of calling runningSum with the user's integer
    System.out.println(BagOfTricks.runningSum(userInt));
    //Output the cube of the user's integer, utilizing the Math.pow() method
    System.out.println("Cubed: " + Math.pow(userInt, 3));
    
  }


}