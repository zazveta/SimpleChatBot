import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int limInf = scan.nextInt();
        int limSup = scan.nextInt();
        int divisor = scan.nextInt();

        int x = 0;
        for (int i = limInf; i <= limSup; i++) {
            int residual = i % divisor;
            if (residual == 0) {
                ++x;
            }
        }
        System.out.println(x);
    }
}