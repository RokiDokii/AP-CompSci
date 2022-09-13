import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a 3 digit number: "); 
    String num = input.nextLine();
    boolean isNumeric = num.chars().allMatch( Character::isDigit );
    if (isNumeric && num.length() <= 3 && num.length() > 2){
        System.out.println(num.charAt(2)+"\n"+num.charAt(1)+"\n"+num.charAt(0));
    } else {
        System.out.println("Must be 3 digits.");
        main(args);
    }
  }
}