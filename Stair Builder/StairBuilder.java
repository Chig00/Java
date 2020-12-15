import java.util.Scanner;

public class StairBuilder {

  private static final char STAIR = 'X';
  private static final char EMPTY = ' ';

  public static void main (String [] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Staircase size: ");
    int size = input.nextInt();
    buildStairCase(size);
  }

  public static void buildStairCase (int size) {
    for (int i = 1; i < size + 1; i++) {
      for (int j = i; j < size; j++) {
        System.out.print(EMPTY);
      }

      for (int j = 0; j < i; j++) {
        System.out.print(STAIR);
      }

      System.out.println();
    }
  }
}
