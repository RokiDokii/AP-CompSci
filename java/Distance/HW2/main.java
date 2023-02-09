import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = input.nextInt(), num2 = input.nextInt();
        while(num1 <= num2){
            if (num1 % 2 == 0)
                System.out.print(num1 + " ");
            num1++;
        }
    }
}