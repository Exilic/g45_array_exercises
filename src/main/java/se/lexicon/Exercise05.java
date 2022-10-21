package se.lexicon;

public class Exercise05 {

  /**
   * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
   * Expected output:
   *              France Paris
   *              Sweden Stockholm
   */
  public static void ex5() {
    String[][] locations = {{"France", "Paris"}, {"Sweden", "Stockholm"}};
    System.out.println();
    System.out.println(locations[0][0] + " " + locations[0][1]);
    System.out.println(locations[1][0] + " " + locations[1][1]);
  }

}
