package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {

  /**
   * 11.Write a program that ask the user for an integer and repeat that
   * question until user give you a specific value that user already has been
   * told about as a message in your program. Store these values in an array
   * and print that array. After that reverse the array elements so that the
   * first element becomes the last element, the second element becomes
   * the second to last element, etc. Do not just reverse the order in which
   * they are printed. You need to change the way they are stored in the
   * array.
   */
  public static void ex11() {
    System.out.println("\n-------------");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a new number (enter 23 in order to end the process) : ");
    int[] completeResponse = new int[1];
    int response = scanner.nextInt();
    completeResponse[0] = response;

    System.out.println();
    while(completeResponse[completeResponse.length - 1] != 23){
      System.out.println("Enter a new number (enter 23 in order to end the process) : ");
      completeResponse = Arrays.copyOf(completeResponse, completeResponse.length +1);

      completeResponse[completeResponse.length - 1] = scanner.nextInt();
    }
    for(int number : completeResponse){
      System.out.print(number + " ");
    }
    int[] reversed = new int[completeResponse.length];
    for(int i = 0; i < completeResponse.length; i++){
      reversed[completeResponse.length - 1 - i] = completeResponse[i];
    }
    System.out.println();
    for(int number : reversed){
      System.out.print(number + " ");
    }
  }

}
