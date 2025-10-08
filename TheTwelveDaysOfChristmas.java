public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    for(int i = 1; i <= 12; i++) {
      printFirstLine(i);
      printVerse(i);
    }
  }

  static void printFirstLine(int iteration) {
    String day = "";
    
    switch(iteration) {
      case 12:
      case 11:
      case 10:
      case 9:
      case 8:
      case 7:
      case 6:
      case 5:
      case 4:
        day = iteration + "th";

        break;
      case 3:
        day = "3rd";

        break;
      case 2:
        day = "2nd";

        break;
      case 1:
        day = "1st";
        
        break;
    }

    System.out.println("On the " + day + " day of Christmas, my true love gave to me");
  }

  static void printVerse(int iteration) {
    switch(iteration) {
      case 12:
        System.out.println("Twelve drummers drumming,");
      case 11:
        System.out.println("Eleven pipers piping,");
      case 10:
        System.out.println("Ten lords a-leaping,");
      case 9:
        System.out.println("Nine ladies dancing,");
      case 8:
        System.out.println("Eight maids a-milking,");
      case 7:
        System.out.println("Seven swans a-swimming,");
      case 6:
        System.out.println("Six geese a-laying,");
      case 5:
        System.out.println("Five golden rings,");
      case 4:
        System.out.println("Four calling birds,");
      case 3:
        System.out.println("Three French hens,");
      case 2:
        System.out.println("Two turtle doves, and");
      case 1:
        System.out.println("A partridge in a pear tree.");
    }
  }
}
