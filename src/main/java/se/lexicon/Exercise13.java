package se.lexicon;

import java.util.Random;

public class Exercise13 {

  /**
   * 13. Create two arrays with arbitrary size and fill one with random numbers.
   * Then copy over the numbers from the array with random numbers so
   * that the even numbers are located in the rear (the right side) part of the
   * array and the odd numbers are located in the front part (the left side).
   */
  public static void ex13() {
    System.out.println("\n-------------");
    Random randomizer = new Random();
    int arraySize = randomizer.nextInt(7) + 5;
    int[] sorted = new int[arraySize];
    int[] randomized = new int[arraySize];
    for(int a = 0; a < randomized.length; a++){
      randomized[a] = randomizer.nextInt(100);
    }

    int beginningIndex = 0;
    int endingIndex = arraySize -1;
    for (int number : randomized) {
      if (number % 2 > 0) {
        sorted[beginningIndex] = number;
        beginningIndex++;
      } else {
        sorted[endingIndex] = number;
        endingIndex--;
      }
    }
    System.out.println();
    for (int item : sorted) {
      System.out.print(item + " ");
    }
  }

}
