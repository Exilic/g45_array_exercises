package se.lexicon;

public class Exercise02 {

  /**
   * 2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
   * If the element does not exist your method should return -1 as value.
   * Expected output: Index position of number 5 is: 2.
   */
  public static void ex2() {
    System.out.println();
    int[] storedNumbers = {11, 23, 5, 39, 54, 72};
    int number = 5;
    int indexPosition = -1;
    for(int j = 0; j < storedNumbers.length; j++){
      if(storedNumbers[j] == number){
        indexPosition = j;
      }
    }
    if(indexPosition == -1){
      System.out.println("Number is not in the array.");
    } else {
      System.out.println("Index position of number " + number + " is: " + indexPosition);
    }
  }
}
