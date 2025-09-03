// 2. The Fitness Center Attendance 
// A gym tracks attendance for 10 days using an array.
// Use a for loop to calculate the total number of visitors in 10 days.
// Identify the day with the maximum attendance.
// Find the minimum attendance day.
// Display all days where attendance was above the average.

import java.util.Scanner;

public class FitnessCenterAttendance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dailyAttendance = new int[10];

        System.out.println("Enter the attendance for 10 days:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            dailyAttendance[i] = scanner.nextInt();
        }

        int totalAttendance = 0;
        for (int attendance : dailyAttendance) {
            totalAttendance += attendance;
        }
        System.out.println("\nTotal visitors in 10 days: " + totalAttendance);

        int maxAttendance = dailyAttendance[0];
        int maxDay = 1;
        int minAttendance = dailyAttendance[0];
        int minDay = 1;

        for (int i = 1; i < dailyAttendance.length; i++) {
            if (dailyAttendance[i] > maxAttendance) {
                maxAttendance = dailyAttendance[i];
                maxDay = i + 1;
            }
            if (dailyAttendance[i] < minAttendance) {
                minAttendance = dailyAttendance[i];
                minDay = i + 1;
            }
        }
        System.out.println("Day with maximum attendance: Day " + maxDay + " with " + maxAttendance + " visitors.");
        System.out.println("Day with minimum attendance: Day " + minDay + " with " + minAttendance + " visitors.");

        double averageAttendance = (double) totalAttendance / dailyAttendance.length;
        System.out.printf("Average daily attendance: %.2f%n", averageAttendance);

        System.out.println("\nDays with attendance above the average:");
        for (int i = 0; i < dailyAttendance.length; i++) {
            if (dailyAttendance[i] > averageAttendance) {
                System.out.println("Day " + (i + 1) + ": " + dailyAttendance[i] + " visitors");
            }
        }
        scanner.close();
    }
}