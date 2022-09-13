import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the Earth weight");
    double earth = input.nextDouble();
    double mercury = earth*0.4, venus = earth*0.9, jupiter = earth*2.5, saturn = earth*1.1; 
    double average = (earth+mercury+venus+jupiter+saturn)/5;
    System.out.println("Mercury: "+mercury+"\n"+"Venus: "+venus+"\n"+"Jupiter: "+jupiter+"\n"+"Saturn: "+saturn);
    System.out.println("Average Weight: "+average);
  }
}