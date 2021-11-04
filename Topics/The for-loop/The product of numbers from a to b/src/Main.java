import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long startInt = scan.nextLong();
        long finalInt = scan.nextLong();
        long sum = 1;

        for (long i = startInt; i < finalInt; i++) {
            sum *= i;
        } System.out.println(sum);
    }
}