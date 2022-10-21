package se.lexicon;

public class Exercise07 {

  /**
   * 7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
   * Expected output: Array: 1 2 4 7 9 12
   * Odd Array: 1 7 9
   */
  public static void ex7() {
    int[] numbers = {1, 2, 4, 7, 9, 12};
    System.out.println();
    System.out.print("Array: ");
    for(int number : numbers){
      System.out.print(number + " ");
    }
    System.out.println();
    System.out.print("Odd Array: ");
    for(int number : numbers){
      if(number % 2 == 1){
        System.out.print(number + " ");
      }
    }

  }

}
