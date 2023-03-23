import java.util.Scanner;

public class WordValidation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = "";
    while (!word.matches("[a-zA-Z]+")) {
      System.out.print("Enter a word without numbers: ");
      word = sc.nextLine();
      if (!word.matches("[a-zA-Z]+")) {
        System.out.println("Invalid input. Please try again.");
      }
    }
    System.out.println("You entered the word: " + word);
  }
}



