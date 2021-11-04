import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();

        final int lim = 1000;
        for (int x = 0; x <= lim; x++) {
            int eq = n1 * (x * x * x) + n2 * (x * x) + n3 * x + n4;
            if (eq == 0) {
                System.out.println(x);
            }
        }
    }
}