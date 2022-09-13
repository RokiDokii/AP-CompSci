import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Hi there. What is your name?");
    String name = input.nextLine();
    System.out.println("Hi "+name+". How old are you?");
    int age = input.nextInt();
    System.out.println(name+" is "+age+" years old."); 
  }
}