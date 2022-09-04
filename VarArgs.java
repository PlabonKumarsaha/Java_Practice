import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  static void debug(String text, Integer... params) {
    System.out.println(Arrays.stream(params));

    for (int i : params)
      System.out.print(i + " ");
    System.out.println();
  }

  public static void main(String[] args) {
    debug("2", 3, 4,5 ,6);
  }
}
