import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please input some text.");
    String userWord = input.nextLine();
    removeVowels(userWord);
  }
  public static String removeVowels(String original) {
    String newWord = "";
    String vowels = "AEIOUaeiou";
    for (int i = 0; i < original.length(); i++){
      if (vowels.indexOf(original.charAt(i)) != -1)
        newWord += "";
      else
        newWord += original.charAt(i);
    }
    System.out.println(newWord);
    return newWord;
  }

}