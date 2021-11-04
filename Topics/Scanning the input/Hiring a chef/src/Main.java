import java.util.Scanner; //put imports you need here

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        String yrsExperience = scanner.next();
        String cuisinePreference = scanner.next();

        System.out.println("The form for " + firstName + " is completed. We will contact you if we need a chef who " +
                "cooks " + cuisinePreference + " dishes and has " + yrsExperience + " years of experience.");
    }
}