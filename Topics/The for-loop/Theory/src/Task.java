// You can experiment here, it won’t be checked

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int limInf = scan.nextInt(10);
    int limSup = scan.nextInt(20);
    int divisor = scan.nextInt(10);

    IntStream limits = IntStream.rangeClosed(10, 20);
    limits.forEach(System.out::println);
    //System.out.println(limits);// put your code here
  }
}
