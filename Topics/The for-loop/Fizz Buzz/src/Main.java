import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();

        final int fizzInt = 3;
        final int buzzInt = 5;
        for (int i = firstInt; i <= secondInt; i++) {
            if (i % fizzInt == 0 && i % buzzInt == 0) {
                System.out.println("FizzBuzz");
            } else if (i % fizzInt == 0) {
                System.out.println("Fizz");
            } else if (i % buzzInt == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}