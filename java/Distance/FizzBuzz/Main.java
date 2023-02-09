import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        for(int i = 1; i <= 100; i++){
            if(i % num1 == 0 && i % num2 == 0)
                System.out.println("FizzBuzz");
            else if(i % num1 == 0)
                System.out.println("Fizz");
            else if(i % num2 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}