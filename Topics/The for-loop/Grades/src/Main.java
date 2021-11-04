import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nGrades = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 1; i <= nGrades; i++) {
            int studNGrade = scanner.nextInt();

            if (studNGrade == 5) {
                ++a;
            } else if (studNGrade == 4) {
                ++b;
            } else if (studNGrade == 3) {
                ++c;
            } else if (studNGrade == 2) {
                ++d;
            }
        } System.out.println(d + " " + c + " " + b + " " + a);
    }
}