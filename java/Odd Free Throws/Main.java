import java.util.Scanner;

class Main {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] game = new int[5];
        for (int i = 1; i < 6; i++){
            System.out.println("In Game " + i + ", How many free throws did you make?");
            game[i-1] = input.nextInt();
        }
        double averageNum = (game[0]+game[1]+game[2]+game[3]+game[4])/5.0;
        int numMod = (int)(averageNum % 2);
        System.out.println("Your Average is: " + averageNum + " Even for 0, Odd for 1: " + numMod);
  }
}