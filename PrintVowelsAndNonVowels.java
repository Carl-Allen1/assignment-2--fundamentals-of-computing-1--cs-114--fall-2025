import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String userString;
    System.out.println("Enter a string: ");

    userString = input.nextLine();

    int numberOfAs = 0, numberOfEs = 0, numberOfIs = 0, numberOfOs = 0, numberOfUs = 0;
    int nonVowels = 0;

    for(int i = 0; i < userString.length(); i++) {
      if(userString.charAt(i) == 'a') {
        numberOfAs++;
      } else if(userString.charAt(i) == 'e') {
        numberOfEs++;
      } else if(userString.charAt(i) == 'i') {
        numberOfIs++;
      } else if(userString.charAt(i) == 'o') {
        numberOfOs++;
      } else if(userString.charAt(i) == 'u') {
        numberOfUs++;
      } else {
        nonVowels++;
      }
    }

    System.out.println("The string has " + numberOfAs + " a's, " + numberOfEs + " e's, " + numberOfIs + " i's, " + numberOfOs + " o's, " + numberOfUs + " u's, and " + nonVowels + " non-vowel characters.");

    input.close();
  }
}
