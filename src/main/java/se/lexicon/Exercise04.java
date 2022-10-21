package se.lexicon;

public class Exercise04 {

  /**
   * 4. Write a program which will copy the elements of one array into another array.
   * Expected output:
   *                Elements from first array: 1 15 20
   *                Elements from second array: 1 15 20
   */
  public static void ex4() {
    int[] original = {34, 12, 92, 45};
    int[] copy = new int[original.length];
    for(int i = 0; i < original.length; i++){
      copy[i] = original[i];
    }
    System.out.println();
    System.out.print("Elements from first array: ");
    for(int number :  original){
      System.out.print(number + " ");
    }
    System.out.println();
    System.out.print("Elements from second array: ");
    for(int number :  copy){
      System.out.print(number + " ");
    }
  }

}
