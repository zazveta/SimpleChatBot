import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aLimit = sc.nextInt();
        int bLimit = sc.nextInt();
        int sum = 0;

        for (int i = aLimit; i <= bLimit; i++) {
            sum += i;
        } System.out.println(sum);
    }
}