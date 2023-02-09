import java.util.Scanner;
public class Main
{
  public static void printArray(double[] arr){
    for (int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
    }
  }

  public static double averageArray(double[] arr){
    double average = 0;
    for (int i = 0; i < arr.length; i++){
        average += arr[i];
    }
    return average/arr.length;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double average = 0;
    // Step One
    System.out.println("Hello! Please tell me how many temperatures you'd like to enter.");
    int amount = input.nextInt();
    while (amount <= 0){
        System.out.println("That is not a valid number of elements. Please use a positive integer.");
        amount = input.nextInt();
    }
    double[] fTemp = new double[amount];
        
    // Step Two
    System.out.println("Okay, list the " + amount + " temperatures in Fahrenheit.");
    for (int i = 0; i < fTemp.length; i++){
        fTemp[i] = input.nextDouble();
    }        
    
    // Step Three
    System.out.println("The Fahrenheit temperatures you added were…");
    printArray(fTemp);
    System.out.println("Average: " + averageArray(fTemp));
        
    // Step Four
    double[] cTemp = new double[fTemp.length];
    for (int i = 0; i < cTemp.length; i++){
        cTemp[i] = ((fTemp[i]-32)*5)/9;
    }
    
    // Step Five
    System.out.println("In Celsius, those temperatures are…");
    printArray(cTemp);
    System.out.println("Average: " + averageArray(cTemp));
        
    // Extra-Credit
    System.out.println("What Fahrenheit temperature would you like to search for?");
    int search = input.nextInt();
    int index = -1;
    for (int i = 0; i < fTemp.length; i++){
        if (search == fTemp[i]){
            index = i; 
        }
    }
    if (index == -1){
        System.out.println("Temperature not found.");
        System.exit(0);
    }
    System.out.println("That temperature is at index " + index + " . What would you like to replace it with?");
    int newTemp = input.nextInt(); 
    fTemp[index] = newTemp; 
    System.out.println("Okay. The new list of Fahrenheit temperature is...");
    printArray(fTemp);
    System.out.println("Average: " + averageArray(fTemp));
  }
}
