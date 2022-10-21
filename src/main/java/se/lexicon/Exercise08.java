package se.lexicon;

import java.util.Arrays;

public class  Exercise08 {

  /**
   * 8. Write a program which will remove the duplicate elements of a given array [20, 20, 40, 20, 30, 40, 50, 60, 50].
   * Expected output:
   *                Array: 20 20 40 20 30 40 50 60 50
   *                Array without duplicate values: 20 40 30 50 60
   */
  public static void ex8() {
    int[] numbers = {20, 20, 40, 20, 30, 40, 50, 60, 50};
    int[] reducedNumbers = new int[numbers.length];
    int reducedIndex = 0;
    Boolean unique = true;
    int test = true ? 12 : 45;
    for(int i = 0; i < numbers.length; i++){
      for(int j = 0; j < reducedIndex; j++){
        if(numbers[i] == reducedNumbers[j]){
          unique = false;
        }
      } if(unique) {
        reducedNumbers[reducedIndex] = numbers[i];
        reducedIndex++;
      }
      unique = true;
    }
    int[] lastArray = Arrays.copyOf(reducedNumbers, reducedIndex);
    for (int k = 0; k < reducedIndex; k++) {
      System.out.print(reducedNumbers[k] + " ");
    }
  }

}
