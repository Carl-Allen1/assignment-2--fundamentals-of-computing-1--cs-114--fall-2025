public class CountFlips {
  public static void main(String[] args) {
    int timesFlippedHeads = 0;
    int timesFlippedTails = 0;

    Coin coin = new Coin();

    for(int i = 0; i < 100; i++) {
      coin.flip();
      
      if(coin.isHeads()) {
        timesFlippedHeads++;
      } else {
        timesFlippedTails++;
      }
    }

    System.out.println("Heads was flipped " + timesFlippedHeads + " times, and tails was flipped " + timesFlippedTails + " times.");
  }
}
