import java.util.ArrayList;
import java.util.Scanner;

class DailyLog {
    String date;
    int treadmillMinutes;
    String weightliftingFocus;
    int proteinGrams;

    // Constructor to initialize the variables
    public DailyLog(String date, int treadmillMinutes, String weightliftingFocus, int proteinGrams) {
        this.date = date;
        this.treadmillMinutes = treadmillMinutes;
        this.weightliftingFocus = weightliftingFocus;
        this.proteinGrams = proteinGrams;
    }

    // Method to display the log details
    public void displayLog() {
        System.out.println("Date: " + date + " | Cardio: " + treadmillMinutes + " mins | Lift: " + weightliftingFocus + " | Protein: " + proteinGrams + "g");
    }
}

public class FitnessTracker {
    public static void main(String[] args) {
        System.out.println("Welcome to the Personal Fitness Tracker!");
        // Ready to implement user interaction
    }
}
