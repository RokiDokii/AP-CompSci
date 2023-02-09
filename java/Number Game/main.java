import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please guess a number between 1-10. You have 5 guesses remaining.");
        int userNum = input.nextInt();
        int num = (int)((Math.random() * 10) + 1);
        for (int guess = 4; guess > 0; guess--){
            if (userNum > num){
                System.out.println("Too high! Guess again. 5 guesses remaining.");
                userNum = input.nextInt();
            } else if (userNum < num){
                System.out.println("Too low! Guess again. " + guess + " guesses remaining.");
                userNum = input.nextInt();
            } else if (userNum == num) {
                System.out.println("Congratulations! You won with " + guess + " guesses remaining.");
                break;
            }   
        }
        System.out.println("Sorry. You couldn't guess the number! You Lose!");
    }
}