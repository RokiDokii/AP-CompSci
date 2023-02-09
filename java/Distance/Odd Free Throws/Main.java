import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! How many free throws did you make in Game 1?");
        int game1 = input.nextInt();
        System.out.println("How about in Game 2?");
        int game2 = input.nextInt();
        System.out.println("In Game 3?");
        int game3 = input.nextInt();
        System.out.println("In Game 4?");
        int game4 = input.nextInt();
        System.out.println("In Game 5?");
        int game5 = input.nextInt();
        double num = (game1+game2+game3+game4+game5)/5;
        int numMod = (int)(num % 2);
        System.out.print("Your Average is: "+num+". Even for 0, Odd for 1: "+numMod);
    }
  }