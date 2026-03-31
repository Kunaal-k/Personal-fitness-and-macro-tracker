import java.util.ArrayList;
import java.util.Scanner;

class DailyLog {
    String date;
    int treadmillMinutes;
    String weightliftingFocus;
    int proteinGrams;

    public DailyLog(String date, int treadmillMinutes, String weightliftingFocus, int proteinGrams) {
        this.date = date;
        this.treadmillMinutes = treadmillMinutes;
        this.weightliftingFocus = weightliftingFocus;
        this.proteinGrams = proteinGrams;
    }

    public void displayLog() {
        System.out.println("Date: " + date + " | Cardio: " + treadmillMinutes + " mins | Lift: " + weightliftingFocus + " | Protein: " + proteinGrams + "g");
    }
}

public class FitnessTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Personal Fitness Tracker!");

        while (running) {
            System.out.println("\n--- Fitness Menu ---");
            System.out.println("1. Add Log\n2. View History\n3. Exit");
            System.out.print("Choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            if (choice == 3) {
                running = false;
                System.out.println("Exiting program...");
            }
        }
        scanner.close();
    }
}
