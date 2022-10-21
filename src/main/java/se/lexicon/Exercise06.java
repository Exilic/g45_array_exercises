package se.lexicon;

public class Exercise06 {

  /**
   * 6. Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
   * Expected output: Average is: 17.3
   */
  public static void ex6() {
    int[] numbers = {43, 5, 23, 17, 2, 14};
    int total = 0;
    for (int number : numbers) {
      total += number;
    }
    double average = (double) total / numbers.length;
    System.out.println();
    System.out.printf("Average is: %.1f", average);

  }

}
