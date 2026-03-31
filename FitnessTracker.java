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
        System.out.println("Date: " + date);
        System.out.println("Treadmill Time: " + treadmillMinutes + " minutes");
        System.out.println("Lifting Focus: " + weightliftingFocus);
        System.out.println("Total Protein: " + proteinGrams + "g");
        System.out.println("-------------------------");
    }
}

public class FitnessTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DailyLog> logHistory = new ArrayList<>();
        boolean running = true;

        System.out.println("Welcome to the Personal Fitness Tracker!");

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add a new daily log");
            System.out.println("2. View all past logs");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter the date (e.g., 14-March): ");
                    String date = scanner.nextLine();
                    
                    System.out.print("Enter treadmill minutes: ");
                    int cardio = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    System.out.print("Enter weightlifting focus: ");
                    String lifting = scanner.nextLine();
                    
                    System.out.print("Enter protein consumed (grams): ");
                    int protein = scanner.nextInt();
                    
                    logHistory.add(new DailyLog(date, cardio, lifting, protein));
                    System.out.println("Log saved successfully!");
                    break;
                    
                case 2:
                    System.out.println("\n--- Your Fitness History ---");
                    if (logHistory.isEmpty()) {
                        System.out.println("No logs found yet.");
                    } else {
                        for (DailyLog log : logHistory) {
                            log.displayLog();
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("Keep working hard. Goodbye!");
                    running = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
