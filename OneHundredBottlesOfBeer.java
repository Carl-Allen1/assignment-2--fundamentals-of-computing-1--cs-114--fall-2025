import java.util.Scanner;

public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int userInt;
    System.out.println("Enter a number: ");

    userInt = input.nextInt();

    System.out.print("\n");

    for(int i = userInt; i > 0; i--) {
      printVerse(i);
      System.out.print("\n");
    }

    input.close();
  }

  static void printVerse(int iteration) {
    System.out.println(iteration + " bottles of beer on the wall");
    System.out.println(iteration + " bottle of beer");
    System.out.println("If one of those bottles should happen to fall");
    System.out.println((iteration - 1) + " bottles of beer on the wall");
  }
}
