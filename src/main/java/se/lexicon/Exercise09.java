package se.lexicon;

public class Exercise09 {

  /**
   * 9. Write a method which will add elements in an array.
   * Remember that arrays are fixed in size so you need to come up with a
   * solution to “expand” the array
   */
  public static void ex9() {
    System.out.println();
    int[] addedTo = new int[] {45, 34, 23};
    int toAdd = 56;
    int[] result = new int[addedTo.length +1];
    for(int i = 0; i < result.length - 1; i++){
      result[i] = addedTo[i];
    }
    result[result.length - 1] = toAdd;
    for(int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }

}
