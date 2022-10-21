package se.lexicon;

public class Exercise12 {

  /**
   * 12.Write a program which will print the diagonal elements of two dimensional array.
   * Expected output: 1 4 9
   */
  public static void ex12() {
    int[][] symmetricalTable = new int[3][3];
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        symmetricalTable[i][j] = (i + 1) * (j + 1);
      }
    }
    System.out.println();
    for(int k = 0; k < symmetricalTable.length; k++){
      System.out.print(symmetricalTable[k][k] + " ");
    }
  }

}
