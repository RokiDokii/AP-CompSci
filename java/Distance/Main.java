import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first X coordinate:  ");
        double firstPairX = input.nextDouble();
        System.out.print(" enter your first Y coordinate: ");
        double firstPairY = input.nextDouble();
        System.out.print("Please enter your second X coordinate:  ");
        double secondPairX = input.nextDouble();
        System.out.print("Please enter your second Y coordinate: ");
        double secondPairY = input.nextDouble();
        System.out.println("Distance between X and Y values." + 
         "\nX Values: " + Math.abs(firstPairX-secondPairX) +
        "\nY Values: " + Math.abs(firstPairY-secondPairY));
        System.out.println("Distance between the points: " + 
        Math.abs(Math.sqrt((Math.pow((secondPairX-firstPairX), 2) + (Math.pow((secondPairY-firstPairY), 2))))));
    }
}