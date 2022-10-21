package se.lexicon;

public class Exercise03 {

  /**
   * 3. Write a program which will sort string array.
   * Expected output:
   *                String array: [Paris, London, New York, Stockholm]
   *                Sort string array: [London, New York, Paris, Stockholm]
   */
  public static void ex3() {
    String[] words = {"Paris", "London", "New York", "Stockholm"};
    Boolean unsorted = true;
    while(unsorted){
      unsorted = false;
      for(int i = 0; i < words.length - 1; i++){
        if(words[i].compareToIgnoreCase(words[i + 1]) > 0){
          String temporary = words[i];
          words[i] = words[i + 1];
          words[i + 1] = temporary;
          unsorted = true;
        }
      }
    }
    System.out.println();
    for(String word :  words){
      System.out.print(word + ", ");
    }
  }




}
