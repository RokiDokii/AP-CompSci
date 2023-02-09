import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please select desired die.\n 1. d4\n 2. d6\n 3. d8\n 4. d10\n 5. d12\n 6. d20\n 7. d100");// Asks user for dice type
        int diceType = input.nextInt(); // Saves the dice type
        if (diceType <= 7 && diceType >= 1 ){ //Checks if user entered number between 1-7
            System.out.println("Rolling dice...");
        } else {
            System.out.println("Invalid.");
            main(args); //Re-prompts user to choose a valid choice
        }
        int result;
        if (diceType == 1){result = (int)(Math.random()*4)+1;} // Rolls d4
        else if (diceType == 2){result = (int)(Math.random()*6)+1;} // Rolls d6
        else if (diceType == 3){result = (int)(Math.random()*8)+1;} // Rolls d8
        else if (diceType == 4){result = (int)(Math.random()*10)+1;} // Rolls d10
        else if (diceType == 5){result = (int)(Math.random()*12)+1;} // Rolls d12
        else if (diceType == 6){ result = (int)(Math.random()*20)+1;} // Rolls d20
        else {result = (int)(Math.random()*100)+1;} // Rolls d100
        System.out.println("Result: " + result); //Prints result
    }
}